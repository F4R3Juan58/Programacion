package ejercicio3;

public class Persona extends SerVivo {
    protected String nombre; 

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        super(edad); 
        this.nombre = nombre;
    }

    // Método público para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Sobrescritura del método saludar para imprimir un saludo específico para la persona
    @Override
    public void saludar() {
        System.out.println("¡Hola! Soy una persona.");
    }
}