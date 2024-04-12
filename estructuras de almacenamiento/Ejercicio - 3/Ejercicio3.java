package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos un array con 10 elementos
		int numeros[] = new int[10];

		// Generamos y mostramos el array en orden normal
		for (int i = 0; i < numeros.length; i++) {
			// Asigna valores al array, comenzando desde 1
			numeros[i] = i + 1;
			// Muestra cada elemento del array seguido de un espacio
			System.out.print(numeros[i] + " ");
		}
		// Imprime una nueva línea después de mostrar el array en orden normal
		System.out.println();

		// Mostramos el array en orden inverso
		for (int j = numeros.length; j > 0; j--) {
			// Muestra cada elemento del array en orden inverso seguido de un espacio
			System.out.print(numeros[j - 1] + " ");
		}
	}
}
