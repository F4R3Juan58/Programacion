package ejercicio7;

//Definición de la clase abstracta Poligono
abstract class Poligono {
 // Atributos protegidos base y altura
 protected double base;
 protected double altura;

 // Constructor de la clase Poligono
 public Poligono(double base, double altura) {
     this.base = base;
     this.altura = altura;
 }

 // Método abstracto para calcular el área
 public abstract double calcularArea();

 // Getters y setters para base y altura
 public double getBase() {
     return base;
 }

 public void setBase(double base) {
     this.base = base;
 }

 public double getAltura() {
     return altura;
 }

 public void setAltura(double altura) {
     this.altura = altura;
 }

 // Método toString para representar el objeto como cadena de texto
 @Override
 public String toString() {
     return "Base: " + base + ", Altura: " + altura;
 }
}
