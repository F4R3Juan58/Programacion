package ejercicio2;

// Clase Factura para representar la factura de un cliente
public class Factura {
    private String nombreCliente;
    private Vendible[] elementos;

    public Factura(String nombreCliente, Vendible[] elementos) {
        this.nombreCliente = nombreCliente;
        this.elementos = elementos;
    }

    // Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0.0;
        for (Vendible elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    // Método toString para imprimir la factura
    @Override
    public String toString() {
    	String cadena = new String();
        cadena+="Factura para: " + nombreCliente+"\n Detalles:\n";
        for (Vendible elemento : elementos) {
            cadena+="- "+elemento.getClass().getSimpleName()+": "+elemento.getPrecio()+"€\n";
        }
        cadena+="Total: "+calcularTotal()+"€";
        return cadena;
    }
}
