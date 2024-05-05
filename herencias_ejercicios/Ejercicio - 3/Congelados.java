package ejercicio3;

public class Congelados extends Producto {
    // VARIABLES
    private double tempRecomendada;

    // CONSTRUCTOR
    public Congelados(double precio, int numLote, double tempRecomendada) {
        super(precio, numLote);
        this.tempRecomendada = tempRecomendada;
    }

    // METODO CALCULAR PRECIO
    double calPrecio(int cantidad) {
        return cantidad * getPrecio();
    }

    // TOSTRING
    @Override
    public String toString() {
        return  super.toString() + "\nLa temperatura recomendada es: " + tempRecomendada;
    }
}
