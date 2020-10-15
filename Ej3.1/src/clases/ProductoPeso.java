package clases;

public class ProductoPeso extends Producto {
	public double cantidad;

	/**
	 * Constructor producto a peso
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param cantidad
	 */
	public ProductoPeso(int id, String nombre, String categoria, double precio, double cantidad) {
		super(id, nombre, categoria, precio);
		this.cantidad = cantidad;
	}
	
}
