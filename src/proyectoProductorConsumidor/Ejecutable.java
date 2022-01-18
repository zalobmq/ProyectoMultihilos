package proyectoProductorConsumidor;

public class Ejecutable {

	public static void productorConsumidor(){
	
	/*
		int nPlazas = 3;
		Cola c = new Cola(nPlazas, false);
		c.llenarParking(c.getListaCoches(), nPlazas);
		System.out.println(c);
		
	**/
		Cola c = new Cola(4, false);
		c.llenarParking(c.getListaCoches(), 4);
		System.out.println("LISTA AL INICIO DEL PROGRAMA: ");
		System.out.println(c.getListaCoches());
		System.out.println("-----------------------");
		TunelLavado tn = new TunelLavado(c);
		Salida s = new Salida(c);
		
		tn.start();
		s.start();
		
	}
}
