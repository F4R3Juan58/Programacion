package ejercicio3;

public class Frescos extends Producto {
    // VARIABLES
    private int diasCaducar;

    // GETTER Y SETTERS
    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    // CONSTRUCTOR
    public Frescos(double precio, int numLote, int diasCaducar) {
        super(precio, numLote);
        setDiasCaducar(diasCaducar);

        if(getDiasCaducar() <= 2) {
            setPrecio(precio * 0.5);
        } else if(getDiasCaducar() >= 3 && getDiasCaducar() <= 5) {
            setPrecio(precio * 0.8);
        }
    }

    // METODO CALCULAR PRECIO
    double calPrecio(int cantidad) {
        return cantidad * getPrecio();
    }

    // TOSTRING
    @Override
    public String toString() {
        return super.toString() + "\nQuedan " + getDiasCaducar() +" dias para que caduque el producto";
    }
}
