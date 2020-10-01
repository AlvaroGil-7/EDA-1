package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numLineas = 5;
		String[] texto = new String[numLineas];

		for(int i = 0; i < numLineas; i++) {
			texto[i] = in.nextLine();
		}
		
		// Mostramos por pantalla
		for(int i = 0; i < numLineas; i++) {
			System.out.println((i+1) + " " + texto[i]);
		}
	}

}
