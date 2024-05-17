package hotel.personas;

// Clase que representa un cliente del hotel
public class Cliente extends Huesped {
    // VARIABLE ADICIONAL
    private int tarjetaCredito; // Número de tarjeta de crédito del cliente

    // GETTERS Y SETTERS
    // Método para obtener el número de tarjeta de crédito del cliente
    public int getTarjetaCredito() {
        return tarjetaCredito;
    }
    // Método para establecer el número de tarjeta de crédito del cliente
    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    // CONSTRUCTOR
    // Constructor de la clase Cliente
    public Cliente(String nombre, String dni, int edad, int tarjetaCredito) {
        // Llama al constructor de la clase base (Huesped) con el nombre, DNI y edad proporcionados
        super(nombre, dni, edad);
        this.tarjetaCredito = tarjetaCredito; // Establece el número de tarjeta de crédito del cliente
    }

    // MÉTODO TO STRING
    // Método para obtener una representación en cadena del cliente, incluyendo su tarjeta de crédito
    @Override
    public String toString() {
        return super.toString() + "\nTarjeta de Crédito: " + tarjetaCredito;
    }

    // MÉTODO EQUALS
    // Método para verificar si dos clientes son iguales, incluyendo su tarjeta de crédito
    public boolean equals(Cliente c) {
        return super.equals(c) && getTarjetaCredito() == c.getTarjetaCredito();
    }
}
