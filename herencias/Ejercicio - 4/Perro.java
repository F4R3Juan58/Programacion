package ejercicio4;

public class Perro extends Animal {
    double peso;
    
    // Constructor de la clase Perro.
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad);
        this.peso = peso;
    }
    
    // Método para mostrar la información del perro.
    void mostrar() {
        super.mostrar();
        System.out.println(" ,es un perro y pesa " + peso + "kg");
    }
    
    // Método que representa el sonido que hace un perro.
    void hablar() {
        System.out.println("Guau");
    }
}
