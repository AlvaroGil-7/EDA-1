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
	 * insertAtPosition(n,x): Inserta el  elemento x en la posici�n n
	 * insertAfter(n,x): Inserta el  elemento x despu�s del elemento en la posici�n n
	 * find(x): Devuelve la posici�n del elemento x
	 * remove(x): Elimina el elemento x
	 * previous(x): Devuelve el elemento anterior al elemento x 
	 * first(): Devuelve el primer elemento de la lista 
	 * last(): Devuelve el �ltimo elemento de la lista
	 * clear(): Vac�a la lista
	 * */
	
	/**
	 * Returns true if the list is empty
	 * @return
	 */
	public boolean isEmpty() {
		
		if (this.primero.equals(null)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Insert object at the beginning of the list
	 * @param dato
	 * @return
	 */
	public Lista insertHead(Object dato) {
		
		// Creamos un nuevo nodo
		NodoLista nodo = new NodoLista(dato, this.primero);
		
		// Actualizamos el nodo primero
		this.primero = nodo;
		
		// Devolvemos la lista
		return this;
	}
	
	/**
	 * Insert object at the end of the list
	 * @param dato
	 * @return
	 */
	public Lista insertLast(Object dato) {
		
		// Creamos un nuevo nodo
		NodoLista nodo = new NodoLista(dato);
		
		// Actualizamos el enlace a siguienteNodo del último nodo de la lista
		this.last().siguienteNodo = nodo;
		
		// Devolvemos la lista
		return this;
	}
	
	/**
	 * Insert at position the object dato (index starts at 0)
	 * @param dato
	 * @param position
	 * @return
	 */
	public Lista insertAtPosition(Object dato, int position) {
		
		// TODO: resolver posiciones negativas, posición 0, y posiciones que se salgan
		
		// Creamos las variables auxiliares
		NodoLista nodoAux = this.primero;
		
		// Iteramos hasta la posición anterior
		for (int i = 0; i < position - 1; i++) {
			nodoAux = nodoAux.siguienteNodo;
		}
		
		// Creamos el nodo y lo guardamos en el enlace correspondiente
		nodoAux.siguienteNodo = new NodoLista(dato, nodoAux.siguienteNodo);
		
		return this;
	}
	
	/**
	 * Find the object with dato: dato
	 * @param dato
	 * @return
	 */
	public NodoLista find(Object dato) {
		
		// Creamos las variables necesarias para la ejecución		
		NodoLista nodoAux = this.primero;
		
		// Iteramos y comprobamos que el dato sea igual, en cuyo caso lo devolvemos
		do {
			if (nodoAux.dato == dato) {
				return nodoAux;
			} else {
				nodoAux = nodoAux.siguienteNodo;
			}
			
		} while (nodoAux != null);
		
		return null;
	}
	
	/**
	 * Remove the object with dato: dato
	 * @param dato
	 * @return
	 */
	public Lista remove(Object dato) {
		
		// EXCEPTION: NULL POINTER
		
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
	
	/**
	 * Returns the first object
	 * @return
	 */
	public NodoLista first() {
		return this.primero;
	}
	
	/**
	 * Returns the last object
	 * @return
	 */
	public NodoLista last() {
		// Buscamos el último nodo
		NodoLista ultimoNodo = this.primero;
		
		while (ultimoNodo.siguienteNodo != null) {
			ultimoNodo = ultimoNodo.siguienteNodo;
		}
		
		// Devolvemos la lista
		return ultimoNodo;
	}
	
	/**
	 * Clear all the list
	 */
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
