package ejercicio2;

public class Programa {

    public static void main(String[] args) {
        Alumno A1 = new Alumno("Jose", 12, 6);
        Profesor P1 = new Profesor("Marta", 26, "Matemáticas");

        P1.hacerExamen();
        A1.hacerExamen(P1);
        P1.ponerNota(A1);
        System.out.println("Nota de " + A1.getNombre() + ": " + A1.getNota());
    }
}
