package listaTools;
public class Lista {

	public NodoLista primero;

	public Lista() {
		// TODO
	}



	/*
	 * Operaciones del TAD
	 * isEmpty(): Determina si la lista es vac�a
	 * insertHead(x): Inserta el elemento x al principio de la lista, ser� el nuevo primer elemento.
	 * insertLast(x): Inserta el elemento x al final de la lista, ser� el �ltimo elemento.
	 * insertAtPosition(n,x): Inserta el  elemento x despu�s del elemento en la posici�n n
	 * find(x): Devuelve la posici�n del elemento x
	 * remove(x): Elimina el elemento x
	 * previous(x): Devuelve el elemento anterior al elemento x 
	 * first(): Devuelve el primer elemento de la lista 
	 * last(): Devuelve el �ltimo elemento de la lista
	 * clear(): Vac�a la lista
	 * */
	
	public boolean isEmpty() {
		
		if (this.primero.equals(null)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Insertar objeto al inicio de la lista
	 * @param dato
	 * @return lista
	 */
	public Lista insertHead(Object dato) {
		
		// Creamos un nuevo nodo
		NodoLista nodo = new NodoLista(dato, this.primero);
		
		// Actualizamos el nodo primero
		this.primero = nodo;
		
		// Devolvemos la lista
		return this;
	}
	
	public Lista insertLast(Object dato) {
		
		// Creamos un nuevo nodo
		NodoLista nodo = new NodoLista(dato);
		
		// Buscamos el último nodo
		NodoLista ultimoNodo = this.primero;
		
		while (ultimoNodo.siguienteNodo != null) {
			ultimoNodo = ultimoNodo.siguienteNodo;
		}
		
		// Posicionamos nodo en la última posición
		ultimoNodo.siguienteNodo = nodo;
		
		// Devolvemos la lista
		return this;
	}
	
	public int find(Object dato) {
		
		// Creamos las variables necesarias para la ejecución
		int pos = -1;
		int i = 0;
		
		NodoLista nodoAux = this.primero;
		
		do { // Iteramos y comprobamos que el dato sea igual
			if (nodoAux.dato == dato) {
				pos = i;
			} else {
				nodoAux = nodoAux.siguienteNodo;
				i++;
			}
			
		} while (pos == -1 && nodoAux != null);
		
		return pos;
	}
	
	public Lista remove(Object dato) {
		
		// Creamos el nodo auxiliar
		NodoLista nodoAux = this.primero;
		
		// Iteramos en busca del dato
		do {
			if (nodoAux.siguienteNodo.dato == dato) {
				nodoAux.siguienteNodo = nodoAux.siguienteNodo.siguienteNodo;
			}
			nodoAux = nodoAux.siguienteNodo;
		} while (nodoAux.siguienteNodo != null);
		
		return this;
	}
	
	public void clear() {
		
		this.primero = null;
		
	}
		
	/*
	 * Bonus
	 * printList() : imprime la lista por pantalla
	 */
	@Override
	public String toString() {
		String texto = new String();
		
		NodoLista nodo = this.primero;
		
		do {
			texto += "\n - " + nodo.dato;
		} while (nodo.siguienteNodo != null);
		
		return texto;
	}
	
}
