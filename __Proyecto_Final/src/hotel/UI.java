package hotel;

import java.time.LocalDate;
import java.util.Scanner;

import hotel.economia.*;
import hotel.gestion.*;
import hotel.personas.*;

public class UI {
    public static void main(String[] args) {
        menu();  // Inicia el menú de la aplicación
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);  // Objeto para leer la entrada del usuario
        Cliente[] clientes = new Cliente[0];  // Array para almacenar clientes
        Huesped[] huespedes = new Huesped[0];  // Array para almacenar huéspedes

        Hotel hotel = new Hotel();  // Crea una instancia del hotel
        hotel.init();  // Inicializa el hotel con datos necesarios
        boolean continuar = true;  // Bandera para controlar el ciclo del menú
        while (continuar) {
            continuar = seleccionarClienteGestor(sc, clientes, huespedes, hotel);  // Muestra el menú y permite la selección del usuario
        }
        sc.close();  // Cierra el Scanner para liberar recursos
    }

    private static boolean seleccionarClienteGestor(Scanner sc, Cliente[] clientes, Huesped[] huespedes, Hotel hotel) {
        System.out.println("Seleccione el usuario que va a utilizar:");
        System.out.println("1. Cliente");
        System.out.println("2. Gestor");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();  // Lee la opción seleccionada por el usuario

        switch (opcion) {
            case 1:
                System.out.println("Usuario Cliente seleccionado");
                clientes = usuarioCliente(sc, clientes, huespedes, hotel);  // Llama al método para manejar clientes
                break;
            case 2:
                System.out.println("Usuario Gestor seleccionado");
                usuarioGestor(sc, hotel);  // Llama al método para manejar gestores
                break;
            case 3:
                return false;  // Sale del ciclo del menú
            default:
                System.out.println("[ERROR] Opción no válida");  // Muestra un mensaje de error para opciones no válidas
        }
        return true;  // Continúa mostrando el menú
    }

    private static Cliente[] usuarioCliente(Scanner sc, Cliente[] clientes, Huesped[] huespedes, Hotel hotel) {
        clientes = crearCliente(sc, clientes);  // Crea un nuevo cliente
        huespedes = comprobarCompania(sc, huespedes);  // Comprueba si hay huéspedes adicionales
        crearReserva(sc, clientes, huespedes, hotel);  // Crea una reserva en el hotel
        return clientes;  // Retorna el array de clientes actualizado
    }

    private static Cliente[] crearCliente(Scanner sc, Cliente[] clientes) {
        System.out.print("Ingrese Nombre: ");
        String nombre = sc.next();  // Lee el nombre del cliente
        System.out.print("Ingrese DNI: ");
        String dni = sc.next();  // Lee el DNI del cliente
        System.out.print("Ingrese Edad: ");
        int edad = sc.nextInt();  // Lee la edad del cliente
        System.out.print("Ingrese Tarjeta de Credito: ");
        int tarjetaCredito = sc.nextInt();  // Lee el número de tarjeta de crédito del cliente

        Cliente[] copy = new Cliente[clientes.length + 1];  // Crea un nuevo array de clientes con un espacio adicional
        System.arraycopy(clientes, 0, copy, 0, clientes.length);  // Copia los clientes existentes al nuevo array
        copy[copy.length - 1] = new Cliente(nombre, dni, edad, tarjetaCredito);  // Añade el nuevo cliente al array
        return copy;  // Retorna el array de clientes actualizado
    }

    private static Huesped[] comprobarCompania(Scanner sc, Huesped[] huespedes) {
        System.out.println("\n¿Vienen huéspedes con usted? (Si/No)");
        String addHuesped = sc.next().toLowerCase();  // Lee la respuesta del usuario
        switch (addHuesped) {
            case "si":
                System.out.println("¿Cuántos huéspedes?");
                int numHuesped = sc.nextInt();  // Lee el número de huéspedes adicionales
                for (int i = 1; i <= numHuesped; i++) {
                    System.out.println("Huésped " + i + ":");
                    huespedes = crearHuesped(sc, huespedes);  // Crea cada huésped adicional
                }
                break;
            case "no":
                break;
            default:
                System.out.println("[ERROR] Respuesta no válida");  // Muestra un mensaje de error para respuestas no válidas
        }
        return huespedes;  // Retorna el array de huéspedes actualizado
    }

    private static Huesped[] crearHuesped(Scanner sc, Huesped[] huespedes) {
        System.out.print("Ingrese Nombre: ");
        String nombre = sc.next();  // Lee el nombre del huésped
        System.out.print("Ingrese DNI: ");
        String dni = sc.next();  // Lee el DNI del huésped
        System.out.print("Ingrese Edad: ");
        int edad = sc.nextInt();  // Lee la edad del huésped

        Huesped[] copy = new Huesped[huespedes.length + 1];  // Crea un nuevo array de huéspedes con un espacio adicional
        System.arraycopy(huespedes, 0, copy, 0, huespedes.length);  // Copia los huéspedes existentes al nuevo array
        copy[copy.length - 1] = new Huesped(nombre, dni, edad);  // Añade el nuevo huésped al array
        return copy;  // Retorna el array de huéspedes actualizado
    }

    private static void crearReserva(Scanner sc, Cliente[] clientes, Huesped[] huespedes, Hotel hotel) {
        System.out.println("\nCrear Reserva");
        System.out.print("Ingrese Tipo de Habitación: ");
        String tipoHabitacion = sc.next().toUpperCase();  // Lee y convierte a mayúsculas el tipo de habitación
        System.out.print("Ingrese Fecha de Inicio (YYYY-MM-DD): ");
        String fechaI = sc.next();  // Lee la fecha de inicio de la reserva
        LocalDate fechaInicio = LocalDate.parse(fechaI);  // Convierte la fecha a un objeto LocalDate
        System.out.print("Ingrese Duración de Reserva: ");
        int diasReserva = sc.nextInt();  // Lee la duración de la reserva en días

        hotel.agregaReservaComprobado(tipoHabitacion, fechaInicio, diasReserva, clientes, huespedes);  // Añade la reserva al hotel
    }

    private static void usuarioGestor(Scanner sc, Hotel hotel) {
        boolean continuar = true;  // Bandera para controlar el ciclo del menú del gestor
        while (continuar) {
            System.out.println("\nGestor del Hotel:");
            System.out.println("1. Mostrar Reservas");
            System.out.println("2. Imprimir Facturas de los Clientes");
            System.out.println("3. Mostrar Habitaciones Disponibles para Hoy");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();  // Lee la opción seleccionada por el gestor

            switch (opcion) {
                case 1:
                    mostrarReservas(hotel);  // Muestra las reservas del hotel
                    break;
                case 2:
                    imprimirFacturas(hotel);  // Imprime las facturas de los clientes
                    break;
                case 3:
                    mostrarHabitacionesDisponibles(hotel);  // Muestra las habitaciones disponibles para hoy
                    break;
                case 4:
                    continuar = false;  // Sale del ciclo del menú del gestor
                    break;
                default:
                    System.out.println("[ERROR] Opción no válida");  // Muestra un mensaje de error para opciones no válidas
            }
        }
    }

    private static void mostrarReservas(Hotel hotel) {
        System.out.println("\nMostrar las reservas");
        hotel.mostrarReservas();  // Llama al método del hotel para mostrar las reservas
    }

    private static void imprimirFacturas(Hotel hotel) {
        System.out.println("\nImprimir las facturas de los clientes");
        Factura.mostrarFacturas(hotel.getReservas());  // Llama al método de Factura para mostrar las facturas de los clientes
    }

    private static void mostrarHabitacionesDisponibles(Hotel hotel) {
        System.out.println("\nMostrar las habitaciones disponibles para el día de hoy");
        hotel.mostrarHabitaciones();  // Llama al método del hotel para mostrar las habitaciones disponibles
    }
}
