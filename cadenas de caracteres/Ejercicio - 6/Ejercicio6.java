package ejercicio6;

import java.util.Scanner;

/**
 * Este programa solicita al usuario que introduzca un nombre y apellidos, y
 * luego elimina las vocales de la entrada.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que introduzca nombre y apellidos
		System.out.println("Introduce nombre y apellidos: ");
		String nombre = sc.nextLine();
		String sinVocales = "";

		char c;
		// Iterar sobre cada carácter del nombre
		for (int i = 0; i < nombre.length(); i++) {
			c = nombre.charAt(i);
			// Verificar si el carácter no es una vocal
			if (!esVocal(c)) {
				sinVocales += c;
			}
		}
		// Imprimir el nombre sin vocales
		System.out.println(sinVocales);
		sc.close();
	}

	// Método para verificar si un carácter es una vocal
	static boolean esVocal(char c) {
		boolean vocal = false;
		String vocales = "aeiouáéíóú";
		c = Character.toLowerCase(c);
		// Verificar si el carácter está presente en la lista de vocales
		if (vocales.indexOf(c) != -1) {
			vocal = true;
		}
		return vocal;
	}
}
