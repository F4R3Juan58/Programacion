package ejemplo3;

//Clase Cuadrado que implementa la interfaz Dibujable
public class Cuadrado implements Dibujable {
 private int lado;

 public Cuadrado(int lado) {
     this.lado = lado;
 }

 @Override
 public void dibujar() {
     System.out.println("Dibujando un cuadrado de lado " + lado);
 }
}
