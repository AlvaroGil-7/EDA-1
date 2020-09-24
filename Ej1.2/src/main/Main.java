package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hay muchos casos en los que va a fallar, porque los numeros se suponen mayores que 0
		
		Scanner in = new Scanner(System.in); // Lectura por teclado

		int dim = 3; // Dimensión de la matrix
		int matrix[][] = new int[dim][dim];

		// Variables auxiliares
		int aux = 0;
		int coord[] = new int[2];
		
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				aux = i * dim + j + 1;
				System.out.println("Introduce el entero " + aux + ": ");
				matrix[i][j] = in.nextInt();
			}			
		}
		
		in.close();
		
		System.out.println("------");		
		
		for (int i = 0; i < dim; i++) {
			aux = 0;
			coord[0] = 0;
			coord[1] = 0;
			for (int j = 0; j < dim; j++) {
				if (aux == 0) {
					aux = matrix[i][j];
					coord[0] = i;
					coord[1] = j;
				}
				else if (matrix[i][j] < aux) {
					aux = matrix[i][j];
					coord[0] = i;
					coord[1] = j;
				}
			}
			
			for (int j = 0; j < dim && aux != 0; j++) {
				if (aux < matrix[j][coord[1]]) aux = 0;
			}
			
			if (aux != 0) {
				System.out.println("Hay un punto de silla en las coordenadas (" + (coord[0] + 1) + "," + (coord[1] + 1) + ") con valor " + aux);
			}
		}
	}

}
