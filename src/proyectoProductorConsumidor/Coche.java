package proyectoProductorConsumidor;

public class Coche {

	private int id;
	
	//Estado inicial: SUCIO , LIMPIO
	private String estado= "SUCIO";
	public Coche() {
		super();
	}
	public Coche(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Coche [id=" + id + ", estado=" + estado + "]";
	}
	
	
	
}
