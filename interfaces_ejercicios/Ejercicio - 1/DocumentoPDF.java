package ejercicio1;

//Subclase concreta DocumentoPDF
public class DocumentoPDF extends Documento {
 public DocumentoPDF(int tamañoBytes) {
     super(tamañoBytes);
 }

 @Override
 public boolean isValid() {
     return getTamañoBytes() < 1024 * 1024; // Menor a 1 megabyte
 }
}

