package ejercicio9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita al usuario una frase para codificar. Luego, utiliza un
 * método de sustitución para codificar la frase.
 */
public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que introduzca una frase para codificar
		System.out.println("Introduce una frase para codificar");
		String frase = sc.nextLine();
		String frasec = "";
		sc.close();
		// Generar un array de caracteres desde 'a' hasta 'z'
		char[] ar = new char[26];
		char[] ar_m = new char[27];
		char[] ar2 = new char[27];
		int j = 0;
		// Llenar el array ar con caracteres desde 'a' hasta 'z'
		for (int i = 0x0061; i < 0x007b; i++) {
			ar[j] = (char) i;
			j++;
		}
		// Encontrar la posición de la letra 'o' en el array ar
		int posar = Arrays.binarySearch(ar, 'o');
		// Copiar los caracteres antes de 'o' en ar_m
		System.arraycopy(ar, 0, ar_m, 0, posar);
		// Copiar los caracteres después de 'o' en ar_m
		System.arraycopy(ar, posar, ar_m, posar + 1, ar.length - posar);
		// Insertar la letra 'ñ' en la posición de 'o' en ar_m
		ar_m[posar] = (char) '\u00F1';
		System.out.println(Arrays.toString(ar_m));

		// Crear ar2, un nuevo array con la letra 'z' al principio y los demás
		// caracteres de ar_m
		for (int i = 1; i < ar2.length; i++) {
			ar2[i] = ar_m[i - 1];
		}
		ar2[0] = 'z';
		System.out.println(Arrays.toString(ar2));

		// Codificar la frase utilizando el método de sustitución
		for (int i = 0; i < frase.length(); i++) {
			int pos = 0;
			// Encontrar la posición del carácter en ar2
			for (int a = 0; a < ar2.length; a++) {
				if (ar2[a] == frase.charAt(i)) {
					pos = a;
				}
			}
			// Agregar al resultado la letra anterior en ar2
			frasec = frasec + ar2[pos - 1];
		}
		// Imprimir la frase codificada
		System.out.println(frasec);
	}
}
