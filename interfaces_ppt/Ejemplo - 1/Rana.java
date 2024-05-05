package ejemplo1;

//Clase Rana que implementa ambas interfaces: Depredador y Presa
public class Rana extends Animal implements Depredador, Presa {
 // Constructor
 public Rana(String nombre, int edad) {
     super(nombre, edad);
 }

 // Implementación de los métodos de las interfaces Depredador y Presa
 @Override
 public void observarPresa(Animal presa) {
     System.out.println("La rana " + this.nombre + " observa a su presa " + presa.getNombre());
 }

 @Override
 public void perseguir(Animal presa) {
     System.out.println("La rana " + this.nombre + " persigue a su presa " + presa.getNombre());
 }

 @Override
 public void comer(Animal presa) {
     System.out.println("La rana " + this.nombre + " se come a su presa " + presa.getNombre());
 }

 @Override
 public void observar() {
     System.out.println("La rana " + this.nombre + " está observando su entorno.");
 }

 @Override
 public void huir() {
     System.out.println("La rana " + this.nombre + " huye de un depredador.");
 }

 @Override
 public void esconderse() {
     System.out.println("La rana " + this.nombre + " se esconde de un depredador.");
 }

 // Método propio de la clase Rana
 @Override
 void emitirSonido() {
     System.out.println("¡Croac! ¡Croac!");
 }
}


