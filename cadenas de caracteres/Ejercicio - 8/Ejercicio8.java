package ejercicio8;

import java.util.Arrays;

/**
 * Este programa contiene dos métodos que trabajan con arrays de caracteres. El
 * método parteA() genera un array de caracteres desde 'a' hasta 'z'. El método
 * parteB() toma un array de caracteres, busca la posición de la letra 'o',
 * inserta la letra 'ñ' en esa posición y devuelve el nuevo array.
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		// Imprimir el array generado por el método parteA()
		System.out.println(Arrays.toString(parteA()));
		// Imprimir el array modificado generado por el método parteB()
		System.out.println(Arrays.toString(parteB(parteA())));
	}

	// Método para generar un array de caracteres desde 'a' hasta 'z'
	static char[] parteA() {
		char[] ar = new char[26];
		int j = 0;
		for (int i = 0x0061; i < 0x007b; i++) {
			ar[j] = (char) i;
			j++;
		}
		return ar;
	}

	// Método para insertar la letra 'ñ' en el array en la posición de la letra 'o'
	static char[] parteB(char[] array) {
		char[] ar = new char[27];
		// Buscar la posición de la letra 'o' en el array dado
		int pos = Arrays.binarySearch(array, 'o');
		// Copiar los caracteres antes de la letra 'o' en el nuevo array
		System.arraycopy(array, 0, ar, 0, pos);
		// Copiar los caracteres después de la letra 'o' en el nuevo array
		System.arraycopy(array, pos, ar, pos + 1, array.length - pos);
		// Insertar la letra 'ñ' en la posición de la letra 'o' en el nuevo array
		ar[pos] = (char) '\u00F1';
		return ar;
	}
}
