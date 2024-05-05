package ejercicio2;

import java.util.Scanner;

public class Alumno extends Persona {
    private Scanner sc = new Scanner(System.in);
    String[] examen = new String[3];
    private int curso;
    private double nota;

    // Constructor
    public Alumno(String nombre, int edad, int curso) {
        super(nombre, edad);
        setCurso(curso);
    }

    // Getters y setters para curso y nota
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para realizar el examen
    void hacerExamen(Profesor profe) {
        System.out.println("Alumno " + getNombre() + ", responda las preguntas del examen:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Pregunta del profesor: " + profe.getExamen()[i]);
            String respuesta = sc.nextLine();
            examen[i] = respuesta;
        }
    }
}
