package ejercicio_repaso_clases;

public class Pila extends Lista {

	// Método para añadir un elemento al final de la pila.
	public void apilar(Integer numero) {
		super.insertar_final(numero); 
	}
	
	// Método para eliminar y devolver el último elemento de la pila.
	public int desapilar() {
		Integer valorEliminar = tabla[tabla.length - 1]; 
		super.eliminar(tabla.length - 1); 
		return valorEliminar; 
	}
}