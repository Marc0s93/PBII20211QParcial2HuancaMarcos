package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	private Boolean isNoFrost;

	public Heladera(Integer id, String descripcion, Boolean isNoFrost, Integer garantia, String marca, Double precio) {
		super(descripcion, marca, precio, garantia);
		this.isNoFrost = isNoFrost;
	}

	public Boolean isNoFrost() {
		return this.isNoFrost;
	}

}
