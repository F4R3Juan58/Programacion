package ejercicio1;

public class Programa {

	public static void main(String[] args) {

        // Crear algunos ficheros para validar
		// Menor a 1 megabyte
        DocumentoPDF documentoPDF = new DocumentoPDF(800000); 
        // Menor a 5 megapíxeles
        ImagenJPG imagenJPG = new ImagenJPG(2000, 1500); 
        // Menor a 5 minutos
        VideoMp4 videoMp4 = new VideoMp4(240); 

        // Crear un servicio de validación con los ficheros
        ValidacionServicio servicio = new ValidacionServicio(new Validable[]{documentoPDF, imagenJPG, videoMp4});

        // Validar los ficheros
        boolean todosValidos = servicio.validarFicheros();
        System.out.println("¿Todos los ficheros son válidos? " + todosValidos); 
    }

}
