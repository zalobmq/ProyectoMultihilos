package proyectoRepartirCuenta;

public class DescenceNumero extends Thread{

	private Operacion op;
	private int nDescender;
	
	public DescenceNumero(Operacion op, int nDescender) {
		super();
		this.op = op;
		this.nDescender = nDescender;
	}
	
	@Override
	public void run() {
		op.descender(op.getNumero(), nDescender);
	}
	
}
