package ejercicio4;

import java.util.Scanner;

/**
 * Este programa solicita al usuario que escriba una frase y cuenta el número de
 * espacios en ella.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que escriba una frase
		System.out.println("Escriba una frase: ");
		String frase = sc.nextLine();
		int espacios = 0;
		char caracter;
		// Contar el número de espacios en la frase
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			if (caracter == ' ') {
				espacios++;
			}
		}
		// Mostrar la cantidad de espacios en la frase
		System.out.println("Tiene " + espacios + " espacios");
		sc.close();
	}
}
