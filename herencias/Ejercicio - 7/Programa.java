package ejercicio7;

//Clase principal que contiene el método main para probar las clases
public class Programa {
 public static void main(String[] args) {
     // Creación de instancias de Triangulo y Rectangulo
     Triangulo triangulo = new Triangulo(5, 3);
     Rectangulo rectangulo1 = new Rectangulo(4, 6);
     Rectangulo rectangulo2 = new Rectangulo(4, 6);

     // Impresión de los objetos y cálculo de áreas
     System.out.println(triangulo);
     System.out.println("Área del Triángulo: " + triangulo.calcularArea());

     System.out.println(rectangulo1);
     System.out.println("Área del Rectángulo: " + rectangulo1.calcularArea());

     // Ejemplo de comparación de objetos Rectangulo utilizando equals
     System.out.println("rectangulo1.equals(rectangulo2): " + rectangulo1.equals(rectangulo2));
 }
}


