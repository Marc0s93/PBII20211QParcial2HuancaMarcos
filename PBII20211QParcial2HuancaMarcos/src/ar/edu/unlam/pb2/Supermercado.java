package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n?mero de venta)
	Integer contadorDeVentas; // Identificador del n?mero de venta
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre = nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new HashMap<Integer, Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		this.productosExistentes.add(nuevo);
		this.productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		int stock = 0;
		for(Producto producto: this.productosDisponibles)
		{
			if(producto.getId()== codigo)
				stock++;
		}
		return stock;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		for(Producto producto: this.productosExistentes)
			if(producto.getId() == codigoDeProducto)
				return true;
		throw new ProductoInexistente("No existe el producto");
		//return false;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for(Producto producto: this.productosExistentes) {
			if(producto.getId() == codigoDeProducto)
				return producto;
		}
		throw new ProductoSinStock("No hay stock del producto");
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en funci?n de su n?mero identificatorio
		return ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if(ventasRealizadas.containsValue(numeroDeVenta)) {
			if(this.productoExiste(codigoDeProducto)) {
				if(this.productosExistentes.remove(this.getProductoPorCodigo(codigoDeProducto)))
				{
					ventasRealizadas.get(numeroDeVenta).aniadirImporte(this.getProductoPorCodigo(codigoDeProducto).getImporte());
					return;
				}
				else
					throw new ProductoSinStock("No hay stock");
			}
			else
				throw new ProductoInexistente("No existe el producto");
		}
	}
	

}
