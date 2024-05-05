package ejercicio1;

//Servicio de validación
public class ValidacionServicio {
 private Validable[] ficheros;

 public ValidacionServicio(Validable[] ficheros) {
     this.ficheros = ficheros;
 }

 public boolean validarFicheros() {
     for (Validable fichero : ficheros) {
         if (!fichero.isValid()) {
             return false;
         }
     }
     return true;
 }

 public static boolean validarFichero(Validable fichero) {
     return fichero.isValid();
 }
}
