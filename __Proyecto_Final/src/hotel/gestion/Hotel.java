package hotel.gestion;

import java.time.LocalDate;
import hotel.habitaciones.*;
import hotel.personas.*;
import hotel.utilidades.*;
import hotel.economia.*;

// Clase Hotel para gestionar las habitaciones y reservas en el hotel
public class Hotel {
    // VARIABLES
    private Habitacion[] habitaciones;  // Array de habitaciones en el hotel
    private Reserva[] reservas;  // Array de reservas en el hotel
    private int cantidadReservas;  // Cantidad actual de reservas en el hotel

    // CONSTRUCTORES
    // Constructor de la clase Hotel
    public Hotel() {
        habitaciones = new Habitacion[10];  // Inicializa el array de habitaciones con capacidad para 10 habitaciones
        reservas = new Reserva[100];  // Inicializa el array de reservas con capacidad para 100 reservas
        cantidadReservas = 0;  // Inicializa la cantidad de reservas a 0
    }

    // MÉTODOS GETTERS Y SETTERS
    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    // MÉTODO INIT
    // Método para inicializar las habitaciones del hotel
    public void init() {
        // Inicializa 8 habitaciones dobles estándar
        for (int i = 0; i < 8; i++) {
            habitaciones[i] = new HabitacionDoble(i + 1, "Habitacion estándar");
        }
        // Inicializa 2 suites especiales
        habitaciones[8] = new Suite(9, "Suite", "Mil y una noches", 3, "Minibar, Spa, Gym");
        habitaciones[9] = new Suite(10, "Suite", "Ave del Paraíso", 4, "Minibar, Spa, Gym");
    }

    // MÉTODO AGREGAR RESERVA
    // Método para agregar una reserva al hotel
    public Reserva agregarReserva(LocalDate fechaInicio, int numeroDias, Cliente[] cliente, Huesped[] huespedes, Habitacion[] habitacion) {
        if (cantidadReservas >= reservas.length) {
            // Ampliar el array de reservas si es necesario
            Reserva[] nuevoArrayReservas = new Reserva[reservas.length * 2];
            System.arraycopy(reservas, 0, nuevoArrayReservas, 0, reservas.length);
            reservas = nuevoArrayReservas;
        }

        // Crea una nueva reserva y la añade al array de reservas
        Reserva nuevaReserva = new Reserva(fechaInicio, numeroDias, cliente, huespedes, habitacion);
        reservas[cantidadReservas] = nuevaReserva;
        cantidadReservas++;
        return nuevaReserva;
    }

    // MÉTODO MOSTRAR RESERVAS
    // Método para mostrar todas las reservas en el hotel
    public void mostrarReservas() {
        System.out.println("Reservas:");
        for (int i = 0; i < cantidadReservas; i++) {
            System.out.println("\nReserva " + (i + 1) + "\n" + reservas[i]);
        }
    }

    // MÉTODO IS HABITACION DISPONIBLE
    // Método para verificar si una habitación está disponible en una fecha dada
    public boolean isHabitacionDisponible(int numeroHabitacion, LocalDate fechaInicio, int duracion) {
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                for (Habitacion habitacion : reserva.getHabitacion()) {
                    if (habitacion.getNumero() == numeroHabitacion) {
                        LocalDate inicioReserva = reserva.getFechaInicio();
                        int duracionReserva = reserva.getNumeroDias();
                        if (UtilFechas.solapan(inicioReserva, duracionReserva, fechaInicio, duracion)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    // MÉTODO GET HABITACIONES DISPONIBLES
    // Método para obtener las habitaciones disponibles de un tipo específico en una fecha dada
    public Habitacion[] getHabitacionesDisponibles(String tipoHabitacion, LocalDate fechaInicio, int duracion) {
        int count = 0;
        Habitacion[] habitacionesDisponibles = new Habitacion[habitaciones.length];

        for (Habitacion habitacion : habitaciones) {
            if (habitacion != null && isTipoCorrecto(habitacion, tipoHabitacion)) {
                if (isHabitacionDisponible(habitacion.getNumero(), fechaInicio, duracion)) {
                    habitacionesDisponibles[count++] = habitacion;
                }
            }
        }

        Habitacion[] resultado = new Habitacion[count];
        System.arraycopy(habitacionesDisponibles, 0, resultado, 0, count);
        return resultado;
    }

    // MÉTODO IS TIPO CORRECTO
    // Método para verificar si una habitación es del tipo correcto
    private boolean isTipoCorrecto(Habitacion habitacion, String tipoHabitacion) {
        if (tipoHabitacion.equalsIgnoreCase("DOBLE")) {
            return habitacion instanceof HabitacionDoble;
        } else if (tipoHabitacion.equalsIgnoreCase("SUITE")) {
            return habitacion instanceof Suite;
        }
        return false;
    }

    // MÉTODO MOSTRAR HABITACIONES
    // Método para mostrar todas las habitaciones en el hotel
    public void mostrarHabitaciones() {
        LocalDate fechaHoy = LocalDate.now();

        System.out.println("Habitaciones del hotel:");

        for (Habitacion habitacion : habitaciones) {
            if (habitacion != null) {
                boolean disponibleHoy = isHabitacionDisponible(habitacion.getNumero(), fechaHoy, 1);
                String disponibilidad = disponibleHoy ? "Disponible" : "No disponible";

                System.out.println("Número: " + habitacion.getNumero() + ", Descripción: " + habitacion.getDescripcion() + ", Estado: " + disponibilidad);
            }
        }
    }

    // MÉTODO AGREGA RESERVA COMPROBADO
    // Método para agregar una reserva al hotel y verificar la disponibilidad de habitaciones
    public Reserva agregaReservaComprobado(String tipoHabitacion, LocalDate fechaInicio, int duracion, Cliente[] cliente, Huesped[] huespedes) {
        Habitacion[] habitacionesDisponibles = getHabitacionesDisponibles(tipoHabitacion, fechaInicio, duracion);

        if (habitacionesDisponibles.length == 0) {
            System.out.println("No hay habitaciones disponibles del tipo " + tipoHabitacion + " para el período especificado. Reserva No Creada");
            return null;
        }

        for (Habitacion habitacion : habitacionesDisponibles) {
            if (habitacion.getCapacidad() >= huespedes.length) {
                Reserva reserva = new Reserva(fechaInicio, duracion, cliente, huespedes, new Habitacion[]{habitacion});
                reservas[cantidadReservas++] = reserva;
                System.out.println("Reserva Creada");
                return reserva;
            }
        }

        System.out.println("No hay habitaciones disponibles del tipo " + tipoHabitacion + " con suficiente capacidad para los huéspedes. Reserva No Creada");
        return null;
    }
}
