package hotel.utilidades;

import java.time.LocalDate;

// Interfaz para proporcionar utilidades relacionadas con fechas
public interface UtilFechas {
    // Método estático para verificar si dos periodos de tiempo se solapan
    static boolean solapan(LocalDate inicio1, int duracion1, LocalDate inicio2, int duracion2) {
        // Calcula las fechas de finalización de cada período
        LocalDate fin1 = inicio1.plusDays(duracion1);
        LocalDate fin2 = inicio2.plusDays(duracion2);
        
        // Comprueba si los períodos se solapan
        return !(inicio1.isAfter(fin2) || fin1.isBefore(inicio2));
    }
}
