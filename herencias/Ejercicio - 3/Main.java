package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// Crear un objeto Supervisor
		Supervisor supervisor = new Supervisor("Juan", 35, 5000.0, "Producción");

		System.out.println("Nombre: " + supervisor.getNombre());
		System.out.println("Edad: " + supervisor.getEdad());
		System.out.println("Salario: $" + supervisor.getSalario());
		System.out.println("Departamento: " + supervisor.getDepartamento());

		// Llamar al método saludar de la clase SerVivo
		supervisor.saludar();

		// Llamar al método saludar de la clase Persona
		Persona persona = new Persona("Ana", 25);
		persona.saludar();
	}

}
