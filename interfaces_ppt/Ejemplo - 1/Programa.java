package ejemplo1;

public class Programa {
	public static void main(String[] args) {
        // Crear instancias de animales
        Leon leon = new Leon("Simba", 5);
        Gacela gacela = new Gacela("Bambi", 3);
        Rana rana = new Rana("Ranita", 1);

        // Acciones del león como depredador
        System.out.println("Acciones del león:");
        leon.observarPresa(gacela);
        leon.perseguir(gacela);
        leon.comer(gacela);
        leon.emitirSonido();
        System.out.println();

        // Acciones de la gacela como presa
        System.out.println("Acciones de la gacela:");
        gacela.observar();
        gacela.huir();
        gacela.esconderse();
        gacela.emitirSonido();
        System.out.println();

        // Acciones de la rana como depredador y presa
        System.out.println("Acciones de la rana:");
        rana.observarPresa(gacela);
        rana.perseguir(gacela);
        rana.comer(gacela);
        rana.observar();
        rana.huir();
        rana.esconderse();
        rana.emitirSonido();
    }
}
