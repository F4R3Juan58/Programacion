package ejercicio10;

import java.util.Scanner;

/**
 * Este programa solicita al usuario que indique una palabra y luego la
 * desordena aleatoriamente.
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que indique una palabra
		System.out.println("Indique una palabra: ");
		String palabra = sc.next();
		String palabra_desordenada = "";
		String nletras = "";
		// Verificar si la palabra ingresada es un espacio en blanco y solicitar una
		// nueva palabra en ese caso
		if (palabra.equals(" ")) {
			while (palabra.equals(" ")) {
				System.out.println("Indique una palabra: ");
				palabra = sc.next();
			}
		} else {
			// Desordenar la palabra aleatoriamente
			for (int i = 0; i < palabra.length(); i++) {
				int letra = (int) (Math.random() * palabra.length());
				// Verificar si la letra ya ha sido seleccionada antes
				while (nletras.contains(String.valueOf(letra))) {
					letra = (int) (Math.random() * palabra.length());
				}
				// Agregar la posición de la letra seleccionada a la lista de letras
				// seleccionadas
				nletras += letra + " , ";
				// Agregar la letra seleccionada a la palabra desordenada
				palabra_desordenada += palabra.charAt(letra);
			}
		}
		// Imprimir la palabra desordenada
		System.out.println(palabra_desordenada.length());
		System.out.println(palabra_desordenada);
		sc.close();
	}
}
