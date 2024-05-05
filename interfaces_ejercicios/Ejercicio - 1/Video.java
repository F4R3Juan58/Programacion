package ejercicio1;

//Clase abstracta Video
public abstract class Video implements Validable {
 private int duracionSegundos;

 public Video(int duracionSegundos) {
     this.duracionSegundos = duracionSegundos;
 }

 public int getDuracionSegundos() {
     return duracionSegundos;
 }

 public void setDuracionSegundos(int duracionSegundos) {
     this.duracionSegundos = duracionSegundos;
 }
}

