package ejemplo1;

//Clase León que implementa la interfaz Depredador
public class Leon extends Animal implements Depredador {
 // Constructor
 public Leon(String nombre, int edad) {
     super(nombre, edad);
 }

 // Implementación de los métodos de la interfaz Depredador
 @Override
 public void observarPresa(Animal presa) {
     System.out.println("El león " + this.nombre + " observa a su presa " + presa.getNombre());
 }

 @Override
 public void perseguir(Animal presa) {
     System.out.println("El león " + this.nombre + " persigue a su presa " + presa.getNombre());
 }

 @Override
 public void comer(Animal presa) {
     System.out.println("El león " + this.nombre + " se come a su presa " + presa.getNombre());
 }

 // Método propio de la clase León
 @Override
 void emitirSonido() {
     System.out.println("¡Rugido del león!");
 }
}

