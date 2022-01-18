package proyectoRepartirCuenta;

public class Operacion {

	private int numero;

	public Operacion(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public synchronized void ascender(int n , int nAascender) {
		int limite=n+nAascender;
		for(int i=n;i<=limite;i++) {
			//System.out.println("Vuelta");
			System.out.println("Siguiente numero: "+i);
		}
	}
	public synchronized void descender(int n , int nDescender) {
		int limite=n-nDescender;
		for(int i=n;i>=limite;i--) {
			System.out.println("Numero anterior: "+i);
		}
	}
	
}
