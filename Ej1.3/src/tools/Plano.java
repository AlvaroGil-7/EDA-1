package tools;

public class Plano {
	
	Punto primerPunto;
	Punto segundoPunto;
	
	public Plano(Punto primerPunto, Punto segundoPunto) {
		this.primerPunto = primerPunto;
		this.segundoPunto = segundoPunto;
	}
	
	public double distanciaEntrePuntos() {
		return Math.sqrt(Math.pow((segundoPunto.coordenadaX - primerPunto.coordenadaX), 2) + Math.pow((segundoPunto.coordenadaY - primerPunto.coordenadaY), 2));
	}
	
	public Punto puntoMedio() {
		return new Punto((primerPunto.coordenadaX + segundoPunto.coordenadaX)/2, (primerPunto.coordenadaY + segundoPunto.coordenadaY)/2);
	}
}
