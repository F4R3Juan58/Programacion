package ejercicio3;

public class Supervisor extends Empleado {
	protected String departamento;

	// Constructor de la clase Supervisor
	public Supervisor(String nombre, int edad, double salario, String departamento) {
		super(nombre, edad, salario);
		this.departamento = departamento;
	}

	// Método público para obtener el departamento del supervisor
	public String getDepartamento() {
		return departamento;
	}

	// Sobrescritura del método saludar para imprimir un saludo específico para el
	// supervisor
	@Override
	public void saludar() {
		System.out.println("¡Hola! Soy un supervisor.");
	}
}