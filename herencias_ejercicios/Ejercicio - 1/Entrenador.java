package ejercicio1;

//Clase Entrenador
public class Entrenador extends Persona {
 private String rango;

 public Entrenador(String dni, String nombre, int edad, String rango) {
     super(dni, nombre, edad);
     this.rango = rango;
 }

 // Getter y setter específico
 public String getRango() {
     return rango;
 }

 public void setRango(String rango) {
     this.rango = rango;
 }

 // Método toString
 @Override
 public String toString() {
     return "Entrenador{" +
             "dni='" + getDni() + '\'' +
             ", nombre='" + getNombre() + '\'' +
             ", edad=" + getEdad() +
             ", rango='" + rango + '\'' +
             '}';
 }

 // Métodos específicos para entrenadores
 public void dirigirEntrenamiento() {
     System.out.println("El entrenador " + getNombre() + " está dirigiendo un entrenamiento.");
 }

 public void dirigirPartido() {
     System.out.println("El entrenador " + getNombre() + " está dirigiendo un partido.");
 }
}

