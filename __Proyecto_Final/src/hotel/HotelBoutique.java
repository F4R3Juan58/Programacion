package hotel;

import java.time.LocalDate;

import hotel.economia.*;
import hotel.gestion.*;
import hotel.personas.*;

public class HotelBoutique {

	public static void main(String[] args) {
		// Inicializar el hotel
		System.out.println("Inicializar el hotel");
        Hotel hotel = new Hotel();  // Crea una instancia del hotel
        hotel.init();  // Inicializa el hotel con datos necesarios

        // Mostrar las habitaciones
        System.out.println("\nMostrar las habitaciones");
        hotel.mostrarHabitaciones();  // Muestra todas las habitaciones disponibles en el hotel

        // Crear al menos 5 reservas con habitaciones de distinto tipo
        Cliente cliente1 = new Cliente("Juan", "12345678A", 30, 123456789);  // Crea un cliente
        Huesped huesped1 = new Huesped("Ana", "23456789B", 25);  // Crea un huésped
        Huesped huesped2 = new Huesped("Pedro", "34567890C", 35);  // Crea otro huésped
        Huesped huesped3 = new Huesped("María", "45678901D", 40);  // Crea otro huésped
        Huesped huesped4 = new Huesped("Luis", "56789012E", 28);  // Crea otro huésped

        LocalDate fechaInicio = LocalDate.now().plusDays(1);  // Fecha de inicio de las reservas, un día después de hoy

        // Crear reservas
        hotel.agregaReservaComprobado("DOBLE", fechaInicio, 3, new Cliente[]{cliente1}, new Huesped[]{huesped1});  // Crea una reserva para una habitación doble
        hotel.agregaReservaComprobado("DOBLE", fechaInicio, 3, new Cliente[]{cliente1}, new Huesped[]{huesped1, huesped2});  // Crea otra reserva para una habitación doble con dos huéspedes
        hotel.agregaReservaComprobado("SUITE", fechaInicio, 3, new Cliente[]{cliente1}, new Huesped[]{huesped1, huesped2});  // Crea una reserva para una suite con dos huéspedes
        hotel.agregaReservaComprobado("SUITE", fechaInicio, 3, new Cliente[]{cliente1}, new Huesped[]{huesped1, huesped2, huesped3, huesped4});  // Crea una reserva para una suite con cuatro huéspedes
        hotel.agregaReservaComprobado("DOBLE", fechaInicio, 3, new Cliente[]{cliente1}, new Huesped[]{huesped1, huesped2, huesped3});  // Crea otra reserva para una habitación doble con tres huéspedes

        // Mostrar las reservas
        System.out.println("\nMostrar las reservas");
        hotel.mostrarReservas();  // Muestra todas las reservas realizadas

        // Imprimir las facturas de los clientes
        System.out.println("\nImprimir las facturas de los clientes");
        Factura.mostrarFacturas(hotel.getReservas());  // Imprime las facturas de todas las reservas realizadas
        
        // Mostrar las habitaciones disponibles para el día de hoy
        System.out.println("\nMostrar las habitaciones disponibles para el día de hoy");
        hotel.mostrarHabitaciones();  // Muestra las habitaciones disponibles para la fecha actual

        // Mostrar el menú
        System.out.println("Menu:");
        UI.menu();  // Llama al método de menú para iniciar la interacción con el usuario
    }
}
