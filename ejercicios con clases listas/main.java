package ejercicio_repaso_clases;

public class Main {

    public static void main(String[] args) {
        // Crear una lista
        Lista lista = new Lista();

        // Insertar elementos en la lista y mostrarla
        lista.insertar_final(1);
        System.out.println("Lista 1: " + lista);
        lista.insertar_final(1);
        System.out.println("Lista 1: " + lista);
        lista.insertar_final(1);
        System.out.println("Lista 1: " + lista);
        lista.insertar_principio(1);
        System.out.println("Lista 1: " + lista);
        lista.insertar(0, 4);
        System.out.println("Lista 1: " + lista);

        // Crear otra lista
        Lista lista2 = new Lista();

        // Insertar elementos en la segunda lista y mostrarla
        lista2.insertar_final(2);
        System.out.println("Lista 2: " + lista2);
        lista2.insertar_final(2);
        System.out.println("Lista 2: " + lista2);
        lista2.insertar_final(2);
        System.out.println("Lista 2: " + lista2);
        lista2.insertar_principio(5);
        System.out.println("Lista 2: " + lista2);

        // Unir las dos listas y mostrar la lista resultante
        lista.unirlistas(lista2);
        System.out.println("Lista 1: " + lista);

        // Eliminar un elemento de la lista y mostrarla
        lista.eliminar(4);
        System.out.println("Lista 1: " + lista);

        // Mostrar el elemento en un índice específico de la lista y buscar un valor en la lista
        lista.mostrarindice(2);
        lista.buscar(5);

        // Comparar las dos listas
        System.out.println();
        lista.equals(lista2);
        System.out.println();

        // Operaciones con una pila
        Pila pila = new Pila();
        for (int i = 0; i <= 5; i++) {
            pila.apilar(i);
        }
        System.out.println(pila);
        System.out.println("Valor desapilado : " + pila.desapilar());
        System.out.println(pila);
        System.out.println("Valor desapilado : " + pila.desapilar());
        System.out.println(pila);
        System.out.println();

        // Operaciones con una cola
        Cola cola = new Cola();
        for (int i = 0; i <= 5; i++) {
            cola.encolan(i);
        }
        System.out.println(cola);
        System.out.println("Valor desencolado: " + cola.desencolan());
        System.out.println(cola);
        System.out.println("Valor desencolado: " + cola.desencolan());
        System.out.println(cola);
    }
}

