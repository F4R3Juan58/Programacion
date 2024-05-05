package ejercicio3;

public class Programa {

    public static void main(String[] args) {
        double precioTotalFresco = 0;
        double precioTotalCongelado = 0;
        double precioTotalConservas = 0;
        double precioTotal = 0;

        Frescos f1 = new Frescos(12.5, 25, 6);
        System.out.println("\nProducto Fresco 1\n" + f1);
        Frescos f2 = new Frescos(10.2, 21, 2);
        System.out.println("\nProducto Fresco 2\n" + f2);
        Frescos f3 = new Frescos(5.99, 20, 7);
        System.out.println("\nProducto Fresco 3\n" + f3);

        Conservas S1 = new Conservas(5.99, 12, "plastico");
        System.out.println("\nProducto Conservas 1\n" + S1);
        Conservas S2 = new Conservas(12.5, 10, "plastico");
        System.out.println("\nProducto Conservas 2\n" + S2);
        Conservas S3 = new Conservas(2, 11, "carton");
        System.out.println("\nProducto Conservas 3\n" + S3);

        Congelados C1 = new Congelados(12.5, 36, -5);
        System.out.println("\nProducto Congelados 1\n" + C1);
        Congelados C2 = new Congelados(20.99, 35, -1);
        System.out.println("\nProducto Congelados 2\n" + C2);
        Congelados C3 = new Congelados(16, 34, -2);
        System.out.println("\nProducto Congelados 3\n" + C3);

        System.out.println();

        precioTotalFresco = f1.calPrecio(2) + f2.calPrecio(3) + f3.calPrecio(1);
        System.out.println("El precio de los productos frescos es: " + precioTotalFresco);
        precioTotalConservas = S1.calPrecio(2) + S2.calPrecio(2) + S3.calPrecio(3);
        System.out.println("El precio de los productos en conserva es: " + precioTotalConservas);
        precioTotalCongelado = C1.calPrecio(4) + C2.calPrecio(1) + C3.calPrecio(1);
        System.out.println("El precio de los productos congelados es: " + precioTotalCongelado);

        precioTotal = precioTotalFresco + precioTotalConservas + precioTotalCongelado;

        System.out.println("El precio total es: " + precioTotal);
    }
}
