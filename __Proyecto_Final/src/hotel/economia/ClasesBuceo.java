package hotel.economia;

// Clase ClasesBuceo que extiende de Servicio e implementa la interfaz Precios
class ClasesBuceo extends Servicio implements Precios {

    // Constructor de la clase ClasesBuceo
    public ClasesBuceo() {
        // Llama al constructor de la clase base (Servicio) con el nombre "Clases de Buceo" y el precio constante CLASES_BUCEO
        super("Clases de Buceo", CLASES_BUCEO);
    }

    // Implementación del método getImporte de la interfaz Precios
    @Override
    public double getImporte() {
        // Retorna el precio del servicio de clases de buceo
        return CLASES_BUCEO;
    }
}
