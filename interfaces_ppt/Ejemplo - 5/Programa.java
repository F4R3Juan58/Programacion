package metodos_staticos;

public class Programa {

	public static void main(String[] args) {
        // Prueba de fechas válidas
		// Fecha válida
        System.out.println("Fecha 1: " + FechaUtil.formatearFecha(5, 5, 2024)); 
        // Fecha válida (año bisiesto)
        System.out.println("Fecha 2: " + FechaUtil.formatearFecha(29, 2, 2024)); 

        // Prueba de fechas no válidas
        // Fecha no válida (día fuera de rango)
        System.out.println("Fecha 3: " + FechaUtil.formatearFecha(32, 1, 2024)); 
        // Fecha no válida (mes fuera de rango)
        System.out.println("Fecha 4: " + FechaUtil.formatearFecha(31, 4, 2024)); 
        // Fecha no válida (año no bisiesto)
        System.out.println("Fecha 5: " + FechaUtil.formatearFecha(29, 2, 2023)); 
    }

}
