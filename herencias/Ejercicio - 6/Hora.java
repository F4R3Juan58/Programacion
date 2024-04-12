package ejercicio6;

public class Hora {
	Integer hora;
	Integer minuto;

	// Constructor de la clase Hora
	public Hora(Integer hora, Integer minuto) {
		// Verifica si la hora está en el rango válido
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			// Muestra un mensaje de error si la hora no es válida
			System.out.println("Las horas no son validas");
		}
		// Verifica si los minutos están en el rango válido
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			// Muestra un mensaje de error si los minutos no son válidos
			System.out.println("Los minutos no son validos");
		}
	}

	// Método para incrementar los minutos
	void incrementar() {
		setMinuto(this.minuto + 1);
	}

	// Método para establecer los minutos
	boolean setMinuto(Integer minuto) {
		// Verifica si los minutos están en el rango válido
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			return true;
		} else {
			this.minuto = 0;
			setHora(this.hora + 1);
			return false;
		}
	}

	// Método para establecer la hora
	boolean setHora(Integer hora) {
		// Verifica si la hora está en el rango válido
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			return true;
		} else {
			this.hora = 0;
			return false;
		}
	}

	// Método para obtener una representación en cadena de la hora
	public String toString() {
		String h = "";
		// Formatea la hora con un cero a la izquierda si es necesario
		if (hora < 10) {
			h += "0" + hora + ":";
		} else {
			h += hora + ":";
		}
		// Formatea los minutos con un cero a la izquierda si es necesario
		if (minuto < 10) {
			h += "0" + minuto;
		} else {
			h += minuto;
		}
		return h; // Devuelve la representación en cadena de la hora
	}
}