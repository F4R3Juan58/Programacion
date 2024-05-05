package ejercicio1;

//Subclase concreta VideoMp4
public class VideoMp4 extends Video {
 public VideoMp4(int duracionSegundos) {
     super(duracionSegundos);
 }

 @Override
 public boolean isValid() {
     return getDuracionSegundos() < 300; // Menor a 5 minutos
 }
}

