package ejercicio2;

import java.util.Scanner;

public class Profesor extends Persona {
    private Scanner sc = new Scanner(System.in);
    private String[] examen = new String[3];
    private String especialidad;

    // Constructor
    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        setEspecialidad(especialidad);
    }

    // Getter y setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para crear el examen
    void hacerExamen() {
        System.out.println("Profesor " + getNombre() + ", escriba las preguntas del examen:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Escriba la pregunta " + (i + 1) + ":");
            String pregunta = sc.nextLine();
            getExamen()[i] = pregunta;
        }
    }

    // Método para poner nota al alumno
    void ponerNota(Alumno alumno) {
        int valoracion;
        int bien = 0;
        double media;

        for (int i = 0; i < 3; i++) {
            System.out.println("Pregunta del examen: " + getExamen()[i]);
            System.out.println("Respuesta del alumno: " + alumno.examen[i]);
            System.out.println("Valoración (1 o 0): ");
            valoracion = sc.nextInt();
            if (valoracion == 1) {
                bien++;
            }
        }
        media = (bien / 3.0) * 10;
        alumno.setNota(media);
    }

	public String[] getExamen() {
		return examen;
	}

	public void setExamen(String[] examen) {
		this.examen = examen;
	}
}
