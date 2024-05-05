package metodos_staticos;

//Interfaz FechaUtil
interface FechaUtil {
 static String formatearFecha(int dia, int mes, int año) {
     if (fechaValida(dia, mes, año)) {
         return String.format("%02d/%02d/%04d", dia, mes, año);
     } else {
         return "Fecha no válida";
     }
 }

 static boolean fechaValida(int dia, int mes, int año) {
     if (mes < 1 || mes > 12) {
         return false;
     }
     if (dia < 1 || dia > diasEnMes(mes, año)) {
         return false;
     }
     return true;
 }

 static int diasEnMes(int mes, int año) {
     int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     if (mes == 2 && esBisiesto(año)) {
         return 29;
     }
     return diasPorMes[mes - 1];
 }

 static boolean esBisiesto(int año) {
     return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
 }
}
