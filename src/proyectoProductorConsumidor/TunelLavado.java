package proyectoProductorConsumidor;

public class TunelLavado extends Thread{

	public Cola cola;

	
	
	public TunelLavado(Cola cola) {
		super();
		this.cola = cola;
	}

	@Override
	public void run() {
		
		int valorInicialCola = cola.getListaCoches().size();
		
		for (int i=0;i<=valorInicialCola;i++) {
			cola.limpiar(cola.getCocheActual(), cola.getListaCoches());
		}
	}
	
}
