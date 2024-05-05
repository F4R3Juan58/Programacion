package ejercicio1;

//Clase Masajista
public class Masajista extends Persona {
 private String titulacion;

 public Masajista(String dni, String nombre, int edad, String titulacion) {
     super(dni, nombre, edad);
     this.titulacion = titulacion;
 }

 // Getter y setter específico
 public String getTitulacion() {
     return titulacion;
 }

 public void setTitulacion(String titulacion) {
     this.titulacion = titulacion;
 }

 // Método toString
 @Override
 public String toString() {
     return "Masajista{" +
             "dni='" + getDni() + '\'' +
             ", nombre='" + getNombre() + '\'' +
             ", edad=" + getEdad() +
             ", titulacion='" + titulacion + '\'' +
             '}';
 }

 // Método específico para masajistas
 public void darMasaje() {
     System.out.println("El masajista " + getNombre() + " está dando un masaje.");
 }
}
