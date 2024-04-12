package ejercicio3;

import java.util.Scanner;

/**
 * Este programa solicita al usuario una palabra secreta y luego le pide que la
 * adivine. Muestra cuántas letras tiene la palabra secreta y proporciona pistas
 * sobre las letras correctas adivinadas.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que escriba la palabra secreta
		System.out.println("Escriba una palabra secreta: ");
		String palabra_secreta = sc.next();
		String palabra;
		int lps = palabra_secreta.length();
		// Mostrar cuántas letras tiene la palabra secreta
		System.out.println("La palabra secreta tiene: " + lps + " letras");
		while (true) {
			System.out.print("\nIndique una palabra: ");
			palabra = sc.next();
			// Comparar la palabra ingresada con la palabra secreta sin importar mayúsculas
			// o minúsculas
			if (palabra_secreta.equalsIgnoreCase(palabra)) {
				break;
			}
			// Mostrar pistas sobre las letras correctas adivinadas y ocultar las
			// incorrectas con asteriscos
			for (int i = 0; i < palabra_secreta.length(); i++) {
				if (palabra_secreta.charAt(i) == palabra.charAt(i)) {
					System.out.print(palabra_secreta.charAt(i));
				} else {
					System.out.print("*");
				}
			}
		}
		// Mostrar la palabra secreta cuando se adivina correctamente
		System.out.println("Has acertado, la palabra secreta es: " + palabra_secreta);
		sc.close();
	}

}
