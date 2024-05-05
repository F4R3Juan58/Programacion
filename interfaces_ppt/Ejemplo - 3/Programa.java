package ejemplo3;

public class Programa {
	public static void main(String[] args) {
        Recta recta = new Recta(5);
        Cuadrado cuadrado = new Cuadrado(4);

        DibujadorDeFiguras.dibujarFigura(recta);
        DibujadorDeFiguras.dibujarFigura(cuadrado);
    }
}
