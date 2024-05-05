package ejercicio2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String nombreCliente = sc.nextLine();

        Vendible[] array = new Vendible[0];

        // Bucle do-while para añadir más productos o servicios
        do {
            System.out.println("Quieres añadir Producto o Servicio (o escribe 'fin' para terminar)");
            String vendible = sc.nextLine();

            switch (vendible.toLowerCase()) {
                case "producto":
                    addVendible(array, crearProducto(sc));
                    break;
                case "servicio":
                    addVendible(array, crearServicio(sc));
                    break;
                case "fin":
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 'Producto', 'Servicio', o escribe 'fin' para terminar.");
            }
         // Continuar mientras el usuario no escriba "fin"
        } while (!sc.nextLine().equalsIgnoreCase("fin")); // Continuar mientras el usuario no escriba "fin"

        Factura factura = new Factura(nombreCliente, array);
        System.out.println(factura);
        sc.close();
    }

    static Vendible[] addVendible(Vendible[] array, Vendible vend) {
        Vendible[] array2 = new Vendible[array.length + 1];
        System.arraycopy(array, 0, array2, 0, array.length);
        array2[array2.length - 1] = vend;
        return array2;
    }

    static Vendible crearProducto(Scanner sc) {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Categoria del producto: ");
        String categoria = sc.nextLine();
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        Vendible producto = new Producto(nombre, categoria, precio);
        return producto;
    }

    static Vendible crearServicio(Scanner sc) {
        System.out.print("Nombre del servicio: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo de servicio: ");
        String tipo = sc.nextLine();
        System.out.print("Duracion en Minutos del servicio: ");
        int duracionMin = sc.nextInt();
        sc.nextLine();

        Vendible servicio = new Servicio(nombre, tipo, duracionMin);
        return servicio;
    }
}

