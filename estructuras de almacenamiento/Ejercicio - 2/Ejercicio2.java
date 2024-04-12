package ejercicio2;

//Importa la clase Scanner del paquete java.util
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mediap = 0;
		int positivos = 0;
		int sumap = 0;
		int median = 0;
		int negativos = 0;
		int suman = 0;
		int ceros = 0;

		// Solicita al usuario que indique la cantidad de números a ingresar
		System.out.print("Indique la cantidad de numeros que quieres añadir:");
		// Lee la cantidad de números ingresados por el usuario
		int n = sc.nextInt();
		// Crea un arreglo para almacenar los números ingresados
		int numeros[] = new int[n];
		// Itera sobre cada posición del array
		for (int i = 0; i < numeros.length; i++) {
			// Solicita al usuario que ingrese un número
			System.out.print("Indique un numero real: ");
			// Lee el número ingresado por el usuario y lo guarda en el array
			numeros[i] = sc.nextInt();

			// Comprueba si el número ingresado es positivo
			if (numeros[i] > 0) {
				// Incrementa el contador de números positivos
				positivos++;
				// Agrega el número positivo a la suma de números positivos
				sumap = sumap + numeros[i];
				// Comprueba si el número ingresado es negativo
			} else if (numeros[i] < 0) {
				// Incrementa el contador de números negativos
				negativos++;
				// Agrega el número negativo a la suma de números negativos
				suman = suman + numeros[i];
			} else {
				// Incrementa el contador de ceros
				ceros++;
			}
		}
		// Calcula la media de los números positivos y negativos
		mediap = sumap / positivos;
		median = suman / negativos;

		// Imprime la media de los números positivos, la media de los números negativos
		// y la cantidad de ceros
		System.out.println("La media de los positivos es: " + mediap + ", la media de los negativos es: " + median
				+ " y la cantidad de ceros introducidos es: " + ceros);
		// Cierra el objeto Scanner para liberar recursos
		sc.close();
	}
}
