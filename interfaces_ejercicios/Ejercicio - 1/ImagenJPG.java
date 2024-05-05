package ejercicio1;

//Subclase concreta ImagenJPG
public class ImagenJPG extends Imagen {
 public ImagenJPG(int ancho, int alto) {
     super(ancho, alto);
 }

 @Override
 public boolean isValid() {
     return getAncho() * getAlto() < 5000000; // Menor a 5 megapíxeles
 }
}
