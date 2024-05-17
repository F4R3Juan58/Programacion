package hotel.economia;

import java.time.LocalDate;
import java.util.Arrays;

import hotel.habitaciones.*;
import hotel.personas.*;

// Clase Reserva que implementa la interfaz Cobrable para representar una reserva en el hotel
public class Reserva implements Cobrable {
    // VARIABLES
    private LocalDate fechaInicio;  // Fecha de inicio de la reserva
    private int numeroDias;  // Número de días de la reserva
    private Cliente[] cliente;  // Cliente asociado a la reserva
    private Huesped[] huesped;  // Huéspedes asociados a la reserva
    private Habitacion[] habitacion;  // Habitaciones asociadas a la reserva

    // CONSTRUCTORES
    // Constructor de la clase Reserva
    public Reserva(LocalDate fechaInicio, int numeroDias, Cliente[] cliente, Huesped[] huesped, Habitacion[] habitacion) {
        this.fechaInicio = fechaInicio;
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    // MÉTODOS GETTERS Y SETTERS
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public Huesped[] getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped[] huesped) {
        this.huesped = huesped;
    }

    public Habitacion[] getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion[] habitacion) {
        this.habitacion = habitacion;
    }

    // Método para calcular la fecha de fin de la reserva
    public LocalDate getFechaFin() {
        return fechaInicio.plusDays(numeroDias);
    }

    // Método para calcular el importe total de la reserva
    @Override
    public double getImporte() {
        double importeTotal = 0;
        for (Habitacion hab : habitacion) {
            importeTotal += hab.getPrecio() * numeroDias;
        }
        return importeTotal;
    }

    // Método toString para representar la reserva como una cadena de caracteres
    @Override
    public String toString() {
        return "Fecha de inicio: " + fechaInicio + "\n" +
                "Número de días: " + numeroDias + "\n" +
                "Cliente: " + Arrays.toString(cliente) + "\n" +
                "Huéspedes: " + Arrays.toString(huesped) + "\n" +
                "Habitación: " + Arrays.toString(habitacion);
    }
}
