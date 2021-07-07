package ar.edu.unlam.pb2;

public abstract class Indumentaria extends Producto {
	private String talle;
	private String color;
	
	public Indumentaria(Integer id, String descripcion, String marca, Double importe, String talle, String color) {
		super(id, descripcion, marca, importe);
		this.talle = talle;
		this.color = color;
	}

	public Object getTalle() {
		return talle;
	}

	public Object getColor() {
		return color;
	}
}
