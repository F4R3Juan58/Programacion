package ejemplo1;

//Interfaz para acciones de depredador
public interface Depredador {
 void observarPresa(Animal presa);
 void perseguir(Animal presa);
 void comer(Animal presa);
}
