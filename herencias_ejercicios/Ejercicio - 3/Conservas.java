package ejercicio3;

public class Conservas extends Producto {
    // VARIABLES
    private String envase;

    // GETTER Y SETTER
    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    // CONSTRUCTOR
    public Conservas(double precio, int numLote, String envase) {
        super(precio, numLote);
        setEnvase(envase);
    }

    // METODO CALCULAR PRECIO
    double calPrecio(int cantidad) {
        int sets = cantidad / 3;
        int unidades = cantidad % 3;
        return (sets * 2 * getPrecio()) + (unidades * getPrecio());
    }

    // TOSTRING
    @Override
    public String toString() {
        return  super.toString() + "\nUsa un envase de " + getEnvase();
    }
}
