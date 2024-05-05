package loggable;

public interface Loggable {
	void log(String cadena);
	
	default void logArray(String array[]) {
		for (int i = 0;i<array.length;i++) {
			log(array[i]);
		}
	}
}
