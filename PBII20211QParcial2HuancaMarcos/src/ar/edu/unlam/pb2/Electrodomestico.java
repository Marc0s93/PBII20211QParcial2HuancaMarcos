package ar.edu.unlam.pb2;

public abstract class Electrodomestico extends Producto {
	private Integer garantia;
	
	public Electrodomestico(Integer id, String descripcion, String marca, Double importe, Integer garantia) {
		super(id, descripcion, marca, importe);
		this.garantia = garantia;
	}
	
	public Integer getGarantia() {
		return garantia;
	}
	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}
}
