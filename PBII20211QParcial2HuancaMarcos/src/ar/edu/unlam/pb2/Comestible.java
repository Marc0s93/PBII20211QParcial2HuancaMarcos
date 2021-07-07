package ar.edu.unlam.pb2;

public abstract class Comestible extends Producto{
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	
	public Comestible(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double importe) {
		super(descripcion, marca, importe);
		this.fechaDeElaboracion = fechaDeElaboracion;
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	

	public Object getFechaDeElaboracion() {
		return this.fechaDeElaboracion;
	}

	public Object getFechaDeVencimiento() {
		return this.fechaDeVencimiento;
	}

	

}
