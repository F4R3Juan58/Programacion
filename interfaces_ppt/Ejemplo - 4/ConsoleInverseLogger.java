package loggable;

public class ConsoleInverseLogger extends ConsoleLogger{
	
	@Override
	public void logArray(String array[]) {
		for (int i = array.length;i>0;i--) {
			log(array[i-1]);
		}
	}

}
