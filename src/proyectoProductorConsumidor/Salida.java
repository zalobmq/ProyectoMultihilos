package proyectoProductorConsumidor;

import java.util.ArrayList;

public class Salida extends Thread{

	private Cola cola;
	

	public Salida(Cola salida) {
		super();
		this.cola = salida;
	}
	
	@Override
	public void run() {
		int valorInicialCola = cola.getListaCoches().size();
		for (int i=0;i<=valorInicialCola;i++) {
			cola.salir(cola.getCocheActual(), cola.getListaCoches());
		}
	}
}
