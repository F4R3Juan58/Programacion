package ejercicio7;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una frase y una palabra, luego cuenta
 * cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		// Solicitar al usuario que introduzca una palabra
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		int repetida = 0, pos;
		// Encontrar la primera aparición de la palabra en la frase
		pos = frase.indexOf(palabra);
		sc.close();
		// Contar todas las apariciones de la palabra en la frase
		while (pos != -1) {
			repetida++;
			pos = frase.indexOf(palabra, pos + 1);
		}

		// Mostrar el resultado de la búsqueda
		if (repetida == 0) {
			System.out.println("La palabra " + palabra + " no está en la frase \"" + frase + "\"");
		} else {
			System.out.println(
					"La palabra " + palabra + " se encuentra " + repetida + " veces en la frase \"" + frase + "\"");
		}
	}
}
