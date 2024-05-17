package hotel.economia;

// Clase Spa que extiende de Servicio e implementa la interfaz Precios
class Spa extends Servicio implements Precios {

    // Constructor de la clase Spa
    public Spa() {
        // Llama al constructor de la clase base (Servicio) con el nombre "Acceso al Spa" y el precio constante SPA
        super("Acceso al Spa", SPA);
    }

    // Implementación del método getImporte de la interfaz Precios
    @Override
    public double getImporte() {
        // Retorna el precio del servicio de acceso al spa
        return SPA;
    }
}
