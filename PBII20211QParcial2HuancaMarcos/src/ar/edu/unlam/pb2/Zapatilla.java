package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {

	public Zapatilla(Integer id, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(id, descripcion, marca, precio, talle.toString(), color);
	}
	
	public String getTalle()
	{
		return this.getTalle().toString();
	}
	
}
