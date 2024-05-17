package hotel.personas;

// Clase abstracta que representa a una persona
public abstract class Persona {
    // VARIABLES
    private String nombre; // Nombre de la persona
    private String dni; // Número de documento de identidad de la persona
    private int edad; // Edad de la persona

    // GETTERS Y SETTERS
    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }
    // Método para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el número de documento de identidad de la persona
    public String getDni() {
        return dni;
    }
    // Método para establecer el número de documento de identidad de la persona
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }
    // Método para establecer la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // CONSTRUCTOR
    // Constructor de la clase Persona
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre; // Inicializa el nombre con el valor proporcionado
        this.dni = dni; // Inicializa el DNI con el valor proporcionado
        this.edad = edad; // Inicializa la edad con el valor proporcionado
    }

    // MÉTODO TO STRING
    // Método para obtener una representación en cadena de la persona
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nDNI: " + getDni() + "\nEdad: " + getEdad();
    }

    // MÉTODO EQUALS
    // Método para verificar si dos personas son iguales
    public boolean equals(Persona p) {
        return getNombre().equals(p.getNombre()) && getDni().equals(p.getDni()) && getEdad() == p.getEdad();
    }
}
