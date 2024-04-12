package ejercicio2;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una palabra secreta y luego le pide que
 * adivine esa palabra. Muestra cuántas letras tiene la palabra secreta y
 * proporciona pistas sobre su posición en el diccionario.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que escriba la palabra secreta
		System.out.println("Escriba una palabra secreta: ");
		String palabra_secreta = sc.next();
		String palabra;
		int lps = palabra_secreta.length();
		// Mostrar cuántas letras tiene la palabra secreta
		System.out.println("La palabra secreta tiene: " + lps + " letras");
		do {
			System.out.print("Indique una palabra: ");
			palabra = sc.next();
			// Comparar la palabra ingresada con la palabra secreta sin importar mayúsculas
			// o minúsculas
			if (palabra_secreta.equalsIgnoreCase(palabra)) {
				break;
			}
			// Comparar las palabras y dar pistas sobre la posición de la palabra secreta en
			// el diccionario
			int antes_despues = palabra_secreta.compareToIgnoreCase(palabra);

			if (antes_despues < 0) {
				System.out.println("La palabra secreta aparece antes en el diccionario");
			}
			if (antes_despues > 0) {
				System.out.println("La palabra secreta aparece después en el diccionario");
			}
		} while (true);
		// Mostrar la palabra secreta cuando se adivina correctamente
		System.out.println("Has acertado, la palabra secreta es: " + palabra_secreta);

		sc.close();
	}
}
