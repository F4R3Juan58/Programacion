package loggable;
import java.util.Arrays;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[0];
		
		boolean addLog=true;
		
		while (addLog) {
			
			System.out.println("Cual es el log que se añade:");
			String newlog = sc.nextLine();
			array=addLogs(array,newlog);
			System.out.println(Arrays.toString(array));
			System.out.println("Quieres añadir mas: S/N");
			String continuar = sc.nextLine();
			continuar=continuar.toUpperCase();
			char cont = continuar.charAt(0);
			switch (cont){
			case 'S': {
				addLog=true;
				break;
			}
			case 'N': {
				addLog=false;
				break;
			}
			default:{
				System.out.println("No has puesto un valor valido, ya no puedes añadir mas");
				addLog=false;
				break;
			}
			
		}
		
	}
		System.out.println("ConsoleLogger normal:");
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.logArray(array);
		
		System.out.println("ConsoleLogger inversa:");
		ConsoleInverseLogger consoleInverserLogger = new ConsoleInverseLogger();
		consoleInverserLogger.logArray(array);
		sc.close();
	}	
	public static String[] addLogs(String array[], String log) {
		String[] array2 = new String[array.length+1];
		System.arraycopy(array,0,array2,0,array.length);
		array2[array2.length-1]=log;
		return array2;

		
	}

}
