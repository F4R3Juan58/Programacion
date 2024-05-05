package ejercicio1;

public class Programa {
	public static void main(String[] args) {
        // Crear instancias de integrantes del equipo
        Futbolista futbolista = new Futbolista("12345678A", "Javier", 25, 10, "Delantero");
        Entrenador entrenador = new Entrenador("87654321B", "Carlos", 45, "Principal");
        Masajista masajista = new Masajista("98765432C", "María", 30, "Quiromasajista");

        // Crear array de integrantes
        Persona[] equipo = {futbolista, entrenador, masajista};

        // Recorrer el array y comprobar las acciones que pueden realizar cada integrante
        for (Persona integrante : equipo) {
            System.out.println(integrante);
            if (integrante instanceof Futbolista) {
                ((Futbolista) integrante).entrenar();
                ((Futbolista) integrante).jugarPartido();
            } else if (integrante instanceof Entrenador) {
                ((Entrenador) integrante).dirigirEntrenamiento();
                ((Entrenador) integrante).dirigirPartido();
            } else if (integrante instanceof Masajista) {
                ((Masajista) integrante).darMasaje();
            }
            System.out.println();
        }
    }
}
