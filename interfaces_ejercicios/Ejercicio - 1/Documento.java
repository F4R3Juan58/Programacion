package ejercicio1;

//Clase abstracta Documento
public abstract class Documento implements Validable {
 private int tamañoBytes;

 public Documento(int tamañoBytes) {
     this.tamañoBytes = tamañoBytes;
 }

 public int getTamañoBytes() {
     return tamañoBytes;
 }

 public void setTamañoBytes(int tamañoBytes) {
     this.tamañoBytes = tamañoBytes;
 }
}

