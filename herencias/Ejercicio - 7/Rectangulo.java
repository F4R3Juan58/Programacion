package ejercicio7;

//Definición de la clase Rectangulo que hereda de Poligono
class Rectangulo extends Poligono {
 // Constructor de la clase Rectangulo
 public Rectangulo(double base, double altura) {
     super(base, altura);
 }

 // Implementación del método abstracto calcularArea para Rectangulo
 @Override
 public double calcularArea() {
     return base * altura;
 }

 // Sobrescritura del método equals para comparar objetos Rectangulo
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (!(obj instanceof Rectangulo)) return false;
     Rectangulo otroRectangulo = (Rectangulo) obj;
     return Double.compare(otroRectangulo.base, base) == 0 && Double.compare(otroRectangulo.altura, altura) == 0;
 }

 // Sobrescritura del método toString para representar el objeto como cadena de texto
 @Override
 public String toString() {
     return "Rectángulo - " + super.toString();
 }
}

