package ejercicio5;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {

	// Método principal
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario el número de elementos del array
		System.out.print("Indique el número de elementos del array: ");
		int elementos = sc.nextInt();
		// Crear un array de enteros con el tamaño especificado por el usuario
		int[] ar = new int[elementos];
		// Llenar el array con números aleatorios entre 1 y 100
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
		}
		// Ordenar el array en orden ascendente
		Arrays.sort(ar);
		// Imprimir el array ordenado
		System.out.println(Arrays.toString(ar));
		// Llamar al método operaciones para realizar cálculos sobre el array
		operaciones(ar);
		// Cerrar el Scanner
		sc.close();
	}

	// Método para realizar operaciones sobre el array
	static void operaciones(int[] ar) {
		// Encontrar el número mayor y el número menor en el array
		int mayor = ar[ar.length - 1];
		int menor = ar[0];
		int suma = 0;
		double media = 0;
		// Calcular la suma de todos los elementos del array
		for (int i = 0; i < ar.length; i++) {
			suma += ar[i];
		}
		// Calcular la media de los elementos del array
		media = suma / (double) ar.length;
		// Imprimir los resultados
		System.out.println("El número mayor es: " + mayor + "\nEl número menor es: " + menor + "\nLa suma es: " + suma
				+ "\nLa media es: " + media);
	}
}