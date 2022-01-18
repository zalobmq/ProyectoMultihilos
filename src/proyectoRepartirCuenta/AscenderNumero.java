package proyectoRepartirCuenta;

public class AscenderNumero extends Thread{

	private Operacion op;
	private int nAascender;
	
	public AscenderNumero(Operacion op, int nAascender) {
		super();
		this.op = op;
		this.nAascender = nAascender;
	}
	
	@Override
	public void run() {
		op.ascender(op.getNumero(), nAascender);
	}
	
	
}
