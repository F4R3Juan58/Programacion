package ejercicio5;

import java.util.Scanner;

/**
 * Este programa solicita al usuario que escriba una frase y la imprime al
 * revés.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que escriba una frase
		System.out.println("Escriba una frase: ");
		String frase = sc.nextLine();
		// Imprimir la frase al revés
		for (int i = frase.length(); i > 0; i--) {
			System.out.print(frase.charAt(i - 1));
		}
		sc.close();
	}
}
