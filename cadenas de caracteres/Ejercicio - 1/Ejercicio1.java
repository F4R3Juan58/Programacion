package ejercicio1;

import java.util.Scanner;

// Este programa solicita al usuario dos frases y luego imprime la más corta entre ellas.
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que escriba la primera frase
		System.out.println("Escriba una frase: ");
		String f1 = sc.nextLine();
		// Solicitar al usuario que escriba la segunda frase
		System.out.println("Escriba una frase: ");
		String f2 = sc.nextLine();

		// Comprobar cuál de las dos frases es más corta y mostrarla
		if (f1.length() < f2.length()) {
			System.out.println("\"" + f1 + "\"");
		} else {
			System.out.println("\"" + f2 + "\"");
		}
		sc.close();
	}
}