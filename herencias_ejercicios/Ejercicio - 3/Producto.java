package ejercicio3;

public abstract class Producto {
    // VARIABLES
    private double precio;
    private int numLote;

    // GETTERS Y SETTERS
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    // CONSTRUCTOR
    public Producto(double precio, int numLote) {
        setPrecio(precio);
        setNumLote(numLote);
    }

    // METODO ABSTRACTO
    abstract double calPrecio(int cantidad);

    // TOSTRING
    @Override
    public String toString() {
        return "El precio es: " + getPrecio() + "\nEl numero de lote es: " + getNumLote();
    }
}
