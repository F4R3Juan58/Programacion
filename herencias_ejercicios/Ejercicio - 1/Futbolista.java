package ejercicio1;

//Clase Futbolista
public class Futbolista extends Persona {
 private int dorsal;
 private String posicion;

 public Futbolista(String dni, String nombre, int edad, int dorsal, String posicion) {
     super(dni, nombre, edad);
     this.dorsal = dorsal;
     this.posicion = posicion;
 }

 // Getters y setters específicos
 public int getDorsal() {
     return dorsal;
 }

 public void setDorsal(int dorsal) {
     this.dorsal = dorsal;
 }

 public String getPosicion() {
     return posicion;
 }

 public void setPosicion(String posicion) {
     this.posicion = posicion;
 }

 // Método toString
 @Override
 public String toString() {
     return "Futbolista{" +
             "dni='" + getDni() + '\'' +
             ", nombre='" + getNombre() + '\'' +
             ", edad=" + getEdad() +
             ", dorsal=" + dorsal +
             ", posicion='" + posicion + '\'' +
             '}';
 }

 // Métodos específicos para futbolistas
 public void entrenar() {
     System.out.println("El futbolista " + getNombre() + " está entrenando.");
 }

 public void jugarPartido() {
     System.out.println("El futbolista " + getNombre() + " está jugando un partido.");
 }
}
