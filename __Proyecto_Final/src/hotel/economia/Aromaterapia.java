package hotel.economia;

// Clase Aromaterapia que extiende de Servicio e implementa la interfaz Precios
class Aromaterapia extends Servicio implements Precios {
    
    // Constructor de la clase Aromaterapia
    public Aromaterapia() {
        // Llama al constructor de la clase base (Servicio) con el nombre "Aromaterapia" y el precio constante AROMATERAPIA
        super("Aromaterapia", AROMATERAPIA);
    }

    // Implementación del método getImporte de la interfaz Precios
    @Override
    public double getImporte() {
        // Retorna el precio del servicio de aromaterapia
        return AROMATERAPIA;
    }
}
