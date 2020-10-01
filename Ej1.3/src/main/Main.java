package main;

import tools.Punto;
import tools.Plano;

public class Main {

	public static void main(String[] args) {
		// Alternativa: Solicitar valores de los puntos al usuario con Scanner
		
		Punto p1 = new Punto(2,3);
		Punto p2 = new Punto(5,9);

		Plano pi = new Plano(p1, p2);
		
		System.out.println("Distancia entre puntos: " + pi.distanciaEntrePuntos());
		System.out.println("Punto medio: " + pi.puntoMedio().toString());
		
	}

}
