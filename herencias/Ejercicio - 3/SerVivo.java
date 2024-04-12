package ejercicio3;

public class SerVivo {
	private int edad;

	// Constructor de la clase SerVivo
	public SerVivo(int edad) {
		this.edad = edad;
	}

	// Método público para obtener la edad del ser vivo
	public int getEdad() {
		return edad;
	}

	// Método público que imprime un saludo genérico para el ser vivo
	public void saludar() {
		System.out.println("¡Hola! Soy un ser vivo.");
	}
}