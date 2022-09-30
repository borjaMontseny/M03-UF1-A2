import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introdueix numA: ");
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		System.out.print("Introdueix numB: ");
		int numB = sc.nextInt();

		System.out.print("Introdueix numC: ");
		int numC = sc.nextInt();

		int gran = 0;
		int mitja = 0;
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

		// IF per buscar el num mitjà
		if (numA < numB && numA > numC || numA > numB && numA < numC) {
			mitja = numA;
		} else if (numB < numA && numB > numC || numB > numA && numB < numC) {
			mitja = numB;
		} else if (numC < numB && numC > numB || numC > numB && numC < numB) {
			mitja = numC;
		}

		sc.close();

		System.out.println("De petit a gran: " + petit + " | " + mitja + " | " + gran);
	}

}
