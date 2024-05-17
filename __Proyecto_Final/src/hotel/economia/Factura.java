package hotel.economia;

import java.util.Arrays;

import hotel.personas.*;

// Clase Factura para generar y manejar facturas
public class Factura {
    // VARIABLES
    private Cliente cliente;  // Cliente asociado a la factura
    private Reserva reserva;  // Reserva asociada a la factura
    private Servicio[] servicio;  // Servicios asociados a la factura

    // CONSTRUCTORES
    // Constructor de la clase Factura
    public Factura(Cliente cliente, Reserva reserva, Servicio[] servicio) {
        this.cliente = cliente;
        this.reserva = reserva;
        this.servicio = servicio;
    }

    // MÉTODOS GETTERS Y SETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Servicio[] getServicio() {
        return servicio;
    }

    public void setServicio(Servicio[] servicio) {
        this.servicio = servicio;
    }

    // Método para calcular el importe total de la factura sumando los importes de los servicios
    public double getImporteTotal() {
        double total = 0;
        for (Servicio servicio : servicio) {
            total += servicio.getImporte();
        }
        return total;
    }

    // Método estático para mostrar las facturas de un array de reservas
    public static void mostrarFacturas(Reserva[] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            Reserva reserva = reservas[i];
            if (reserva != null) {
                System.out.println("Factura para la reserva: " + (i + 1));
                System.out.println("Fecha de inicio: " + reserva.getFechaInicio());
                System.out.println("Fecha de fin: " + reserva.getFechaFin());
                System.out.println("Importe: " + reserva.getImporte());
                System.out.println();
            }
        }
    }

    // Método toString para representar la factura como una cadena de caracteres
    @Override
    public String toString() {
        return "Factura:" +
                "cliente=" + cliente +
                ", reserva=" + reserva +
                ", servicios=" + Arrays.toString(servicio);
    }
}
