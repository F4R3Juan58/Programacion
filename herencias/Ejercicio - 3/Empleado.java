package ejercicio3;

public class Empleado extends Persona {
	double salario;

	// Constructor de la clase Empleado
	public Empleado(String nombre, int edad, double salario) {
		super(nombre, edad);
		this.salario = salario;
	}

	// Método público para obtener el salario del empleado
	public double getSalario() {
		return salario;
	}
}