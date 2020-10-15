package clases;

public class ProductoUnidades extends Producto {
	public int unidades;

	/**
	 * Constructor Producto por unidades
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param unidades
	 */
	public ProductoUnidades(int id, String nombre, String categoria, double precio, int unidades) {
		super(id, nombre, categoria, precio);
		this.unidades = unidades;
	}
	
}
