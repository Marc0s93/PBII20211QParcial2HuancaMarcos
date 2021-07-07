package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {
	private String talle;

	public Remera(Integer id, String descripcion, String talle, String marca, String color, Double importe) {
		super(id, descripcion, marca, importe);
		this.talle = talle;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

}
