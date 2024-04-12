package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializa la variable 'suma' para almacenar la suma de los elementos del
		// arreglo.
		int suma = 0;
		// Crea un arreglo 'ar' de tamaño 10 para almacenar números enteros.
		int[] ar = new int[10];
		// Itera sobre cada elemento del arreglo 'ar'.
		for (int i = 0; i < ar.length; i++) {
			// Genera un número aleatorio entre 1 y 100, y lo asigna al elemento 'i' del
			// arreglo.
			ar[i] = (int) (Math.random() * 100 + 1);
			// Agrega el valor del elemento 'i' al total de la suma.
			suma += ar[i];
		}
		// Imprime la suma total de todos los elementos del arreglo.
		System.out.println("La suma es " + suma);
	}
}