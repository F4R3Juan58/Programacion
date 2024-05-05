package ejercicio7;

//Definición de la clase Triangulo que hereda de Poligono
class Triangulo extends Poligono {
 // Constructor de la clase Triangulo
 public Triangulo(double base, double altura) {
     super(base, altura);
 }

 // Implementación del método abstracto calcularArea para Triangulo
 @Override
 public double calcularArea() {
     return (base * altura) / 2;
 }

 // Sobrescritura del método toString para representar el objeto como cadena de texto
 @Override
 public String toString() {
     return "Triángulo - " + super.toString();
 }
}


