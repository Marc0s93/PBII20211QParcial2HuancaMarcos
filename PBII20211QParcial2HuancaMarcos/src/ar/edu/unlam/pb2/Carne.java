package ar.edu.unlam.pb2;

public class Carne extends Comestible{
	private Double kilos;
	
	public Carne(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos, String marca, Double importe) {
		super(id, descripcion, fechaDeElaboracion, fechaDeVencimiento, marca, importe);
		this.kilos = kilos;
	}
	
	public Double getKilos() {
		return kilos;
	}
	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}
	
}
