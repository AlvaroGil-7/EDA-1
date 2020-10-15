package clases;

public class Producto {
	public int id;
	public String nombre;
	public String categoria;
	public double precio;
	
	/**
	 * Creamos un producto
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param precio
	 */
	public Producto(int id, String nombre, String categoria, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}

}
