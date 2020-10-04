package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] vowels = new String[]{"a", "e", "i", "o", "u"};
		List<String> vowelsList = Arrays.asList(vowels);
		
		System.out.println("Escribe una frase:");
		String text = in.nextLine();

		int vowelsCount = 0;
		int consonantsCount = 0;
		int spacesCount = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (vowelsList.contains(String.valueOf(text.charAt(i)))) vowelsCount++;
			else if (text.charAt(i) == ' ') spacesCount++;
			else consonantsCount++;
		}
		
		System.out.println("\nLa cadena introducida tiene:");
		System.out.println("\t# " + vowelsCount + " vocal(es)");
		System.out.println("\t# " + consonantsCount + " consonante(s)");
		System.out.println("\t# " + spacesCount + " espacio(s)");

	}

}
