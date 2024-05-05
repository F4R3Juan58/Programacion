package loggable;

public class ConsoleLogger implements Loggable{

	public void log(String cadena) {
		System.out.println(cadena);
	}
	
	public void logArray(String array[]) {
		Loggable.super.logArray(array);
	}

}
