package hotel.habitaciones;

import hotel.economia.Precios;

// Clase que representa una suite en el hotel
public class Suite extends Habitacion implements Precios {
    // VARIABLES ADICIONALES
    private String nombre; // Nombre de la suite
    private int numeroPlazas; // Número de plazas de la suite
    private String serviciosExtra; // Servicios extra de la suite

    // GETTERS Y SETTERS
    // Método para obtener el nombre de la suite
    public String getNombre() {
        return nombre;
    }
    // Método para establecer el nombre de la suite
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método para obtener el número de plazas de la suite
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    // Método para establecer el número de plazas de la suite
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    // Método para obtener los servicios extra de la suite
    public String getServiciosExtra() {
        return serviciosExtra;
    }
    // Método para establecer los servicios extra de la suite
    public void setServiciosExtra(String serviciosExtra) {
        this.serviciosExtra = serviciosExtra;
    }

    // CONSTRUCTOR
    // Constructor de la clase Suite
    public Suite(int numero, String descripcion, String nombre, int numeroPlazas, String serviciosExtra) {
        // Llama al constructor de la clase base (Habitacion) con el número de habitación, el precio de una suite y la descripción proporcionados
        super(numero, SUITE, descripcion);
        this.nombre = nombre; // Establece el nombre de la suite
        this.numeroPlazas = numeroPlazas; // Establece el número de plazas de la suite
        this.serviciosExtra = serviciosExtra; // Establece los servicios extra de la suite
    }

    // MÉTODO GET CAPACIDAD
    // Implementación del método abstracto para obtener la capacidad de la suite (en este caso, 4)
    @Override
    public int getCapacidad() {
        return 4; // Devuelve la capacidad de la suite
    }

    // MÉTODO TO STRING
    // Método para obtener una representación en cadena de la suite, incluyendo sus características adicionales
    @Override
    public String toString() {
        return super.toString() + "\nNombre: " + getNombre() + "\nNúmero de Plazas: " + getNumeroPlazas() + "\nServicios Extra: " + getServiciosExtra();
    }

    // MÉTODO EQUALS
    // Método para verificar si dos suites son iguales, incluyendo sus características adicionales
    public boolean equals(Suite s) {
        return super.equals(s) && getNombre().equals(s.getNombre()) && getNumeroPlazas() == s.getNumeroPlazas() && getServiciosExtra().equals(s.getServiciosExtra());
    }
}
