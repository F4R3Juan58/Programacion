package ejercicio2;

// Clase Servicio que implementa la interfaz Vendible
public class Servicio implements Vendible {
    private String nombre;
    private String tipo;
    private int duracionMin;

    public Servicio(String nombre, String tipo, int duracionMin) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionMin = duracionMin;
    }

    @Override
    public double getPrecio() {
        double precioPorMinuto;

        // Calcular precio por minuto según el tipo de servicio
        switch (tipo.toUpperCase()) {
            case "PINTURA":
                precioPorMinuto = 0.75;
                break;
            case "ELECTRICIDAD":
                precioPorMinuto = 1.0;
                break;
            case "FONTANERÍA":
                precioPorMinuto = 1.25;
                break;
            default:
                precioPorMinuto = 1.5;
                break;
        }

        // Calcular y retornar el precio total del servicio
        return precioPorMinuto * duracionMin;
    }
}
