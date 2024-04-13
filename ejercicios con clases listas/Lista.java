package ejercicio_repaso_clases;

import java.util.Scanner;
import java.util.Arrays;

public class Lista {
	Integer tabla[];

	// Constructor que inicializa la tabla con tamaño 0.
	public Lista() {
		tabla = new Integer[0];
	}

	// Inserta un número al final de la lista.
	public void insertar_final(Integer numero) {
		Integer tabla2[] = new Integer[tabla.length + 1];
		System.arraycopy(tabla, 0, tabla2, 0, tabla.length);
		tabla2[tabla2.length - 1] = numero;
		tabla = tabla2;
	}

	// Inserta un número al principio de la lista.
	public void insertar_principio(Integer numero) {
		Integer tabla2[] = new Integer[tabla.length + 1];
		System.arraycopy(tabla, 0, tabla2, 1, tabla.length);
		tabla2[0] = numero;
		tabla = tabla2;
	}

	// Inserta un número en un lugar de la lista cuyo índice se pasa como parámetro.
	public void insertar(Integer numero, Integer posicion) {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		while (!valido) {
			if (posicion > tabla.length) {
				System.out.print("La posición indicada no es válida, indique otra: ");
				posicion = sc.nextInt();
				valido = false;
			} else {
				valido = true;
			}
		}
		sc.close();
		Integer tabla2[] = new Integer[tabla.length + 1];
		System.arraycopy(tabla, 0, tabla2, 0, posicion);
		System.arraycopy(tabla, posicion, tabla2, posicion + 1, tabla2.length - posicion - 1);
		tabla2[posicion] = numero;
		tabla = tabla2;
	}

	// Añade al final de la lista los elementos de otra lista que se pasa como
	// parámetro.
	public void unirlistas(Lista tabla2) {
		Integer tabla3[] = new Integer[tabla.length + tabla2.tabla.length];
		System.arraycopy(tabla, 0, tabla3, 0, tabla.length);
		System.arraycopy(tabla2.tabla, 0, tabla3, tabla.length, tabla2.tabla.length);
		System.out.println(
				"Unimos las dos siguientes tablas: " + Arrays.toString(tabla) + " y " + Arrays.toString(tabla2.tabla));
		tabla = tabla3;
	}

	// Elimina un elemento cuyo índice en la lista se pasa como parámetro.
	public void eliminar(Integer indice) {
		Integer tabla2[] = new Integer[tabla.length - 1];
		System.arraycopy(tabla, 0, tabla2, 0, indice);
		System.arraycopy(tabla, indice + 1, tabla2, indice, tabla2.length - indice);
		tabla = tabla2;
	}

	// Obtiene el elemento cuyo índice se pasa como parámetro.
	public void mostrarindice(Integer indice) {
		System.out.println("Mostramos el valor del índice " + indice + " que es " + tabla[indice]);
	}

	// Busca un número en la lista, devolviendo el índice del primer lugar donde se
	// encuentre. Si no está, devuelve -1.
	public void buscar(Integer numero) {
		int encontrado = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numero) {
				encontrado = i;
				break;
			} else {
				encontrado = -1;
			}
		}
		if (encontrado == -1) {
			System.out.println("No se ha encontrado el número " + numero + " en la lista, el índice es " + encontrado);
		} else {
			System.out.println("El número " + numero + " se encuentra en el índice " + encontrado);
		}
	}

	// Muestra los valores de la lista que se pasa como parámetro.
	void ver(Integer[] tabla) {
		System.out.println("La lista queda de la siguiente forma:\n" + Arrays.toString(tabla));
	}

	// Modifica el método toString().
	@Override
	public String toString() {
		return Arrays.toString(tabla);
	}

	// Compara dos objetos Lista.
	@Override
	public boolean equals(Object o) {
		Lista otraLista = (Lista) o;
		if (Arrays.equals(tabla, otraLista.tabla)) {
			System.out.println("Son la misma lista " + toString());
			return true;
		} else {
			System.out.println("Son listas distintas " + toString() + " y " + otraLista);
			return false;
		}
	}
}
