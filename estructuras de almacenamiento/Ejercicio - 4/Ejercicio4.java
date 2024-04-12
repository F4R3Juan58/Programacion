package ejercicio4;

//Importa la clase Scanner del paquete java.util
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crea un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Solicita al usuario que indique el número de elementos del arreglo
		System.out.print("Indique el numero de elementos del array: ");
		// Lee el número de elementos ingresados por el usuario
		int elementos = sc.nextInt();
		// Crea un arreglo con la cantidad de elementos especificada por el usuario
		int[] ar = new int[elementos];

		// Itera sobre cada posición del arreglo
		for (int i = 0; i < ar.length; i++) {
			// Asigna valores al arreglo, comenzando desde 1
			ar[i] = i + 1;
			// Muestra cada elemento del arreglo seguido de un espacio
			System.out.print(ar[i] + " ");
		}

		// Muestra el elemento central del arreglo llamando a la función 'central'
		System.out.println("\nEl centro es: " + central(ar));
		// Cierra el objeto Scanner para liberar recursos
		sc.close();
	}

	// Función para encontrar el elemento central del arreglo
	static int central(int[] ar) {
		// Devuelve el elemento central del arreglo
		return ar[(ar.length - ar.length / 2) - 1];
	}
}
