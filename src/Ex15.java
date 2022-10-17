import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escriu un programa que demani una lletra i digui si és vocal o consonant.

		System.out.print("Introdueix una lletra: ");
		Scanner sc = new Scanner(System.in);
		String lletra = sc.next();
		sc.close();

		String esVocal = "És vocal";
		String esConsonant = "És consonant";

		// Comprueba vocales minus
		if (lletra.charAt(0) == 'a' || lletra.charAt(0) == 'e' || lletra.charAt(0) == 'e' || lletra.charAt(0) == 'o'
				|| lletra.charAt(0) == 'u') {
			System.out.println(esVocal);
			// Comprueba vocales mayus
		} else if (lletra.charAt(0) == 'A' || lletra.charAt(0) == 'E' || lletra.charAt(0) == 'I'
				|| lletra.charAt(0) == 'O' || lletra.charAt(0) == 'U') {
			System.out.println(esVocal);
			// Cualquier otra palabra que no sea aeio || AEIOU
		} else {
			System.out.println(esConsonant);
		}

	}

}
