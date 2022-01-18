package proyectoProductorConsumidor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * PARKING : 
 * 			
 */
public class Cola extends Thread{
	
	private int plazasParking;
	private List<Coche> listaCoches;
	private boolean ocupado;
	private Coche cocheActual;
	
	public Cola() {
		super();
	}

	public Cola(int plazasParking, boolean ocupado) {
		super();
		this.plazasParking = plazasParking;
		this.listaCoches = new ArrayList<Coche>();
		this.ocupado = ocupado;
	}
	
	public  void llenarParking(List<Coche> lista , int plazas) {
		
		for (int i=1;i<=plazas;i++) {	
			Coche c = new Coche(i);
			lista.add(c);	
		}
	}
	
	
	/*
	 * 1-Cuando limpias, el coche espera en el puesto 3 segundos,y el estado pasa a ser (limpio)
	 * 2-Cuando lo entregas, borra el cliente del array.
	 * 3-Cuanto del array esta vacio pone terminado.
	 * 
	 * */
	
	
	public synchronized void limpiar(Coche cocheactual , List<Coche> lista) {

		cocheactual = lista.get(0);
		System.out.println("INFO: "+cocheactual);
		//System.out.println("INFO: "+cocheactual);
		while(!isOcupado()) {
		try {
			wait();
			sleep(3000);
			cocheactual.setEstado("LIMPIO");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		}
		setOcupado(false);
		notifyAll();
		
	
		
	}
	public synchronized void salir(Coche cocheactual , List<Coche> lista) {
		while(isOcupado()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("INFO: "+cocheactual);
			lista.remove(lista.get(0));
			System.out.println("LISTA TRAS BORRAR: ");
			System.out.println(lista);
		}
		setOcupado(true);
		notifyAll();
	} 
	
	public int getPlazasParking() {
		return plazasParking;
	}

	public void setPlazasParking(int plazasParking) {
		this.plazasParking = plazasParking;
	}

	

	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	

	public Coche getCocheActual() {
		return cocheActual;
	}

	public void setCocheActual(Coche cocheActual) {
		this.cocheActual = cocheActual;
	}

	@Override
	public String toString() {
		return "Cola [plazasParking=" + plazasParking + ", listaCoches=" + listaCoches + ", ocupado=" + ocupado + "]";
	}

	

	 
	
	
	
}
