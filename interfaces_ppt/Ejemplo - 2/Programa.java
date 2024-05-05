package interfaces;

public class Programa {

	public static void main(String[] args) {
		ReproductorMP3 mp3 = new ReproductorMP3();
		mp3.reproducir();
		mp3.pausar();
		mp3.detener();

	}

}
