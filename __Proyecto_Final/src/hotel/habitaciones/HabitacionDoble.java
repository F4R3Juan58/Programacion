package hotel.habitaciones;

import hotel.economia.Precios;

// Clase que representa una habitación doble en el hotel
public class HabitacionDoble extends Habitacion implements Precios {
	// CONSTRUCTOR
	// Constructor de la clase HabitacionDoble
	public HabitacionDoble(int numero, String descripcion) {
		// Llama al constructor de la clase base (Habitacion) con el número de habitación, el precio de una habitación doble y la descripción proporcionados
		super(numero, HABITACION_DOBLE, descripcion);
	}

	// MÉTODO GET CAPACIDAD
	// Implementación del método abstracto para obtener la capacidad de la habitación (en este caso, 2)
	@Override
	public int getCapacidad() {
		return 2; // Devuelve la capacidad de la habitación doble
	}
}
