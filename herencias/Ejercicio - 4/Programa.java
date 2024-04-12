package ejercicio4;

public class Programa {
    public static void main(String[] args) {
        Animal a = new Animal("Animal", 5);
        Perro p = new Perro("Coco", 5, 12.5);
        Gato g = new Gato("Michi", 6, "negro");
        a.mostrar();
        System.out.println();
        p.mostrar();
        p.hablar();
        g.mostrar();
        g.hablar();
    }
}
