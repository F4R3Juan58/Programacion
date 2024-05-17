package hotel.economia;

// Clase abstracta Servicio que implementa la interfaz Cobrable para representar servicios cobrables en el hotel
abstract class Servicio implements Cobrable {
    // VARIABLES
    private String nombre;  // Nombre del servicio
    private double precio;  // Precio del servicio

    // CONSTRUCTOR
    // Constructor de la clase Servicio
    public Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // MÉTODOS GETTERS
    // Método para obtener el nombre del servicio
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el precio del servicio
    public double getPrecio() {
        return precio;
    }

    // MÉTODO GETIMPORTE
    // Implementación del método getImporte de la interfaz Cobrable
    @Override
    public double getImporte() {
        // Retorna el precio del servicio como importe
        return precio;
    }
}
