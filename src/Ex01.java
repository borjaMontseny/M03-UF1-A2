import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani tres números per pantalla i desi el número més
		 * gran en una variable anomenada gran i el més petit en una variable anomenada
		 * petit.
		 */

		System.out.print("Introdueix numA: ");
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		System.out.print("Introdueix numB: ");
		int numB = sc.nextInt();

		System.out.print("Introdueix numC: ");
		int numC = sc.nextInt();

		int gran = 0;
		int petit = 0;

		// IF per buscar el num gran
		if (numA > numB) {
			gran = numA;

		} else if (numB > numC) {
			gran = numB;

		} else if (numC > numA) {
			gran = numC;
		} else {
			System.out.println("Error");
		}

		// IF per buscar el num petit
		if (numA < numB) {
			petit = numA;

		} else if (numB < numC) {
			petit = numB;

		} else if (numC < numA) {
			petit = numC;

		} else {
			System.out.println("Error");
		}

		System.out.println("petit = " + petit + " | gran = " + gran);

		sc.close();

	}

}
