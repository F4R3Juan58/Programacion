package ejercicio2;

// Clase Producto que implementa la interfaz Vendible
public class Producto implements Vendible {
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
