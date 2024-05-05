package ejercicio1;

//Clase abstracta Imagen
public abstract class Imagen implements Validable {
 private int ancho;
 private int alto;

 public Imagen(int ancho, int alto) {
     this.ancho = ancho;
     this.alto = alto;
 }

 public int getAncho() {
     return ancho;
 }

 public void setAncho(int ancho) {
     this.ancho = ancho;
 }

 public int getAlto() {
     return alto;
 }

 public void setAlto(int alto) {
     this.alto = alto;
 }
}

