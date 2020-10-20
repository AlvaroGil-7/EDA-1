package main;

import clases.*;
import listaTools.Lista;

public class Main {

	public static void main(String[] args) {
		
		// Lista de productos
		
		// Creamos la lista vacía
		Lista listaCompra = new Lista();
		
		// Creamos los productos
		Producto ambientador = new Producto(0, "Ambientador", "Limpieza", 3.55);
		ProductoPeso pollo = new ProductoPeso(1, "Pollo", "Comida", 4.20, 4.0);
		ProductoUnidades manzana = new ProductoUnidades(2, "Manzana", "Comida", 3.5, 15);
		
		listaCompra.insertHead(ambientador);
		listaCompra.insertLast(pollo);
		listaCompra.insertAtPosition(manzana, 1);
		
		listaCompra.remove(pollo);
	}

}
