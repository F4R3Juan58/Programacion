package ejercicio4;

public class Animal {
	String nombre;
	int edad;

	// Constructor de la clase Animal.
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Método para mostrar la información básica del animal.
	void mostrar() {
		System.out.print("El nombre es " + nombre + ", tiene " + edad + " años");
	}
}