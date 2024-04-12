package ejercicio6;

public class HoraExacta extends Hora {
	Integer segundo;

	// Constructor de la clase HoraExacta que recibe la hora, los minutos y los
	// segundos como parámetros
	public HoraExacta(Integer hora, Integer minuto, Integer segundo) {
		super(hora, minuto);
		// Verifica si los segundos están en el rango válido
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			// Muestra un mensaje de error si los segundos no son válidos
			System.out.println("Los segundos no son validos");
		}
	}

	// Método para incrementar los segundos en uno
	void incrementar() {
		setSegundo(this.segundo + 1);
	}

	// Método para establecer los segundos
	boolean setSegundo(Integer segundo) {
		// Verifica si los segundos están en el rango válido
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			return true;
		} else {
			super.incrementar();
			setSegundo(0);
			return false;
		}
	}

	// Método para obtener una representación en cadena de la hora exacta
	public String toString() {
		String h = ":";
		// Formatea los segundos con un cero a la izquierda si es necesario
		if (segundo < 10) {
			h += "0" + segundo;
		} else {
			h += segundo;
		}
		// Devuelve la representación en cadena de la hora exacta
		return super.toString() + h;
	}

	// Método para comparar si dos objetos HoraExacta son iguales
	public boolean equals(Object o) {
		boolean iguales;
		HoraExacta otra = (HoraExacta) o;
		// Compara si la hora, los minutos y los segundos son iguales
		if (this.hora.equals(otra.hora) && this.minuto.equals(otra.minuto) && this.segundo.equals(otra.segundo)) {
			// Muestra un mensaje si las horas son iguales
			System.out.println("Son la misma hora " + toString()); 
			iguales = true;
		} else {
			// Muestra un mensaje si las horas son diferentes
			System.out.println("Son distinta hora " + toString() + " y " + otra); 
			iguales = false;
		}
		// Devuelve si las horas son iguales o no
		return iguales; 
	}
}
