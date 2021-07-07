package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico{
	private Integer pulgadas;	
	
	public Televisor(Integer id, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(descripcion, marca, precio, garantia);
		this.pulgadas = pulgadas;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	
}
