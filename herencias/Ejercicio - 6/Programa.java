package ejercicio6;

public class Programa {

	public static void main(String[] args) {
		Hora t=new Hora(10,20);
		System.out.println(t.toString());
		t.setHora(22);
		System.out.println(t.toString());
		t.setMinuto(59);
		System.out.println(t.toString());
		t.incrementar();
		System.out.println(t.toString());
		
		System.out.println();
		
		HoraExacta h=new HoraExacta(10,20,00);
		
		
		System.out.println(h.toString());
		h.setHora(23);
		System.out.println(h.toString());
		h.setMinuto(59);
		System.out.println(h.toString());
		h.setSegundo(59);
		System.out.println(h.toString());
		h.incrementar();
		System.out.println(h.toString());
	
		System.out.println();
		HoraExacta p1=new HoraExacta(10,20,00);
		HoraExacta p2=new HoraExacta(10,20,00);
		HoraExacta p3=new HoraExacta(10,20,20);
		p1.equals(p2);
		p1.equals(p3);
		}

}
