package ar.edu.unlam.pb2;

public abstract class Comestible {
	private String descripcion;
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private String marca;
	private Double importe;
	
	
	public Comestible(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double importe) {
		
		this.descripcion = descripcion;
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.marca = marca;
		this.importe = importe;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public Object getFechaDeElaboracion() {
		return this.fechaDeElaboracion;
	}

	public Object getFechaDeVencimiento() {
		return this.fechaDeVencimiento;
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
