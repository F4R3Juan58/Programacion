package hotel.personas;

// Clase que representa a un huésped del hotel, hereda de la clase Persona
public class Huesped extends Persona {
    // CONSTRUCTOR
    // Constructor de la clase Huesped que llama al constructor de la clase base (Persona)
    public Huesped(String nombre, String dni, int edad) {
        super(nombre, dni, edad); // Llama al constructor de la clase base con los parámetros proporcionados
    }
}
