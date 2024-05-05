package ejemplo3;

//Clase Recta que implementa la interfaz Dibujable
public class Recta implements Dibujable {
 private int longitud;

 public Recta(int longitud) {
     this.longitud = longitud;
 }

 @Override
 public void dibujar() {
     System.out.println("Dibujando una recta de longitud " + longitud);
 }
}

