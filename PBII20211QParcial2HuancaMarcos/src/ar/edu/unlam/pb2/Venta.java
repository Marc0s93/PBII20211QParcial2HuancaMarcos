package ar.edu.unlam.pb2;

public class Venta {
	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Double importe;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		this.importe = 0.0;
	}

	public Double getImporte() {
		return importe;
	}

	public void aniadirImporte(Double importe) {
		this.importe += importe;
	}
	
	

}
