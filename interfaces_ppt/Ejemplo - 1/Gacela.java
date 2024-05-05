package ejemplo1;

//Clase Gacela que implementa la interfaz Presa
public class Gacela extends Animal implements Presa {
 // Constructor
 public Gacela(String nombre, int edad) {
     super(nombre, edad);
 }

 // Implementación de los métodos de la interfaz Presa
 @Override
 public void observar() {
     System.out.println("La gacela " + this.nombre + " está observando su entorno.");
 }

 @Override
 public void huir() {
     System.out.println("La gacela " + this.nombre + " huye de un depredador.");
 }

 @Override
 public void esconderse() {
     System.out.println("La gacela " + this.nombre + " se esconde de un depredador.");
 }

 // Método propio de la clase Gacela
 @Override
 void emitirSonido() {
     System.out.println("¡Sonido de alerta de la gacela!");
 }
}


