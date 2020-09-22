import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Lectura por teclado

		int dim = 3; // Dimensión de la matrix
		int matrix[][] = new int[dim][dim];

		// Variables auxiliares
		int aux = 0;
		
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				aux = i * dim + j + 1;
				System.out.println("Introduce el entero " + aux + ": ");
				matrix[i][j] = in.nextInt();
			}			
		}
		
		System.out.println("------");
		
		System.out.println("Introduce la linea que quieres intercambiar: ");
		int linea1 = in.nextInt();
		linea1 = linea1 - 1;
		System.out.println("Por que linea quieres que la cambiemos: ");
		int linea2 = in.nextInt();
		linea2 = linea2 - 1;
		
		for(int i = 0; i < dim ; i++) {
			aux = matrix[linea1][i];
			matrix[linea1][i] = matrix[linea2][i];
			matrix[linea2][i] = aux;
		}
		
		for(int i = 0; i < dim; i++) {
			System.out.println();
			for(int j = 0; j < dim; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

}
