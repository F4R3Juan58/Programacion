package ejercicio_repaso_clases;

public class Cola extends Lista {

    // Método para añadir un elemento al final de la cola.
    public void encolan(Integer numero) {
        super.insertar_final(numero); 
    }
    
    // Método para eliminar y devolver el primer elemento de la cola.
    public Integer desencolan() {
        Integer valorEliminar = tabla[0]; 
        super.eliminar(0); 
        return valorEliminar; 
    }
}
