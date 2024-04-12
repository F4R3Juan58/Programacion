package ejercicio4;

public class Gato extends Animal {
    String color;
    
    // Constructor de la clase Gato.
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }
    
    // Método para mostrar la información del gato.
    void mostrar() {
        super.mostrar();
        System.out.println(" ,es un gato y es de color " + color);
    }
    
    // Método que representa el sonido que hace un gato.
    void hablar() {
        System.out.println("Miau");
    }
}