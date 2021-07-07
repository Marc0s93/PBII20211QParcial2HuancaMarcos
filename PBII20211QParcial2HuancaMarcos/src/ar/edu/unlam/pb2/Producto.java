package ar.edu.unlam.pb2;

public abstract class Producto {
	private String descripcion;
	private String marca;
	private Double importe;
	
	
	public Producto(String descripcion, String marca, Double importe) {
		this.descripcion = descripcion;
		this.marca = marca;
		this.importe = importe;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
