package proyectoJoin;

import java.util.ArrayList;

public class HiloJoin extends Thread{

	private int tama�o;
	
	private ArrayList<String> lista = new ArrayList<String>();
	
	private String elemento = "X";
	
	
	public HiloJoin(int tama�o, String elemento) {
		super();
		this.tama�o = tama�o;
		this.elemento = elemento;
	}
	public ArrayList<String> getLista() {
		return lista;
	}
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<tama�o;i++) {
			lista.add(elemento);
			if (lista.size() != tama�o) {
			System.out.println("Estado cesta"+lista);
			}else {
				System.out.println("Estado cesta"+lista);
				System.out.println("");
				System.out.println("TODAS LAS: "+elemento+ " DENTRO.Hay: "+lista.size());
				System.out.println("");
				System.out.println("-------------------------------------------------------");
			}
		}
		
	}
	
}
