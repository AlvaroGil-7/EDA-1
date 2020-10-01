package tools;

public class Punto {
	
	int coordenadaX;
	int coordenadaY;
	
	public Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
	public String toString() {
		return "(" + coordenadaX + ", " + coordenadaY + ")";
	}
	
}
