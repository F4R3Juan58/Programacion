package hotel.habitaciones;

// Clase abstracta que representa una habitación en el hotel
public abstract class Habitacion {
	// VARIABLES
	private int numero; // Número de la habitación
	private double precio; // Precio de la habitación por noche
	private String descripcion; // Descripción de la habitación

	// GETTERS Y SETTERS
	// Método para obtener el número de la habitación
	public int getNumero() {
		return numero;
	}
	// Método para establecer el número de la habitación
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Método para obtener el precio de la habitación
	public double getPrecio() {
		return precio;
	}
	// Método para establecer el precio de la habitación
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	// Método para obtener la descripción de la habitación
	public String getDescripcion() {
		return descripcion;
	}
	// Método para establecer la descripción de la habitación
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// CONSTRUCTOR
	// Constructor de la clase Habitacion
	public Habitacion(int numero, double precio, String descripcion) {
		this.numero = numero; // Asigna el número de la habitación
		this.precio = precio; // Asigna el precio de la habitación
		this.descripcion = descripcion; // Asigna la descripción de la habitación
	}

	// MÉTODO ABSTRACTO
	// Método abstracto para obtener la capacidad de la habitación (debe ser implementado en las subclases)
	public abstract int getCapacidad();

	// MÉTODO TO STRING
	// Método para obtener una representación en cadena de la habitación
	@Override
	public String toString() {
		return "Numero de Habitación: " + getNumero() + "\nPrecio: " + getPrecio() + "\nDescripción: " + getDescripcion();
	}

	// MÉTODO EQUALS
	// Método para verificar si dos habitaciones son iguales
	public boolean equals(Habitacion h) {
		// Compara el número, precio y descripción de dos habitaciones
		if (getNumero() == h.getNumero() && getPrecio() == h.getPrecio() && getDescripcion().equals(h.getDescripcion())) {
			return true; // Devuelve true si son iguales en todos los aspectos
		}
		return false; // Devuelve false en caso contrario
	}
}
