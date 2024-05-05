package interfaces;

import java.util.Scanner;

public class ReproductorMP3 {
	Scanner sc = new Scanner(System.in);
	void reproducir() {
		System.out.println("Introduzca la url que quieras reproducir: ");
		String url = sc.nextLine();
		System.out.println("Se esta reproduciendo: " + url);
	}
	void pausar() {
		System.out.println("Se ha pausado la reproducion");
	}
	void detener() {
		System.out.println("Se ha detenido la reproducion");
	}
}
