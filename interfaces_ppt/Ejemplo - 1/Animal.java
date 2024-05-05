package ejemplo1;

//Clase abstracta Animal que implementa las interfaces según corresponda
public abstract class Animal {
 // Propiedades comunes a todos los animales
 String nombre;
 int edad;

 // Constructor
 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 // Método abstracto que debe ser implementado por las subclases
 abstract void emitirSonido();

 // Getters y setters
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public int getEdad() {
     return edad;
 }

 public void setEdad(int edad) {
     this.edad = edad;
 }
}

