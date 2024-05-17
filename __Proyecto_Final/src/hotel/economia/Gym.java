package hotel.economia;

// Clase Gym que extiende de Servicio e implementa la interfaz Precios
class Gym extends Servicio implements Precios {

    // Constructor de la clase Gym
    public Gym() {
        // Llama al constructor de la clase base (Servicio) con el nombre "Acceso al Gimnasio" y el precio constante GYM
        super("Acceso al Gimnasio", GYM);
    }

    // Implementación del método getImporte de la interfaz Precios
    @Override
    public double getImporte() {
        // Retorna el precio del servicio de acceso al gimnasio
        return GYM;
    }
}
