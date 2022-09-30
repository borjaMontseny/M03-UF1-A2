import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani un import sense impostos, i ens digui l'import
		 * aplicant els impostos, si és major de 15000 se li aplicarà un 16% d’impostos,
		 * en cas contrari un 10%.
		 */

		System.out.print("Introduce un importe bruto: ");
		Scanner sc = new Scanner(System.in);
		double importe = sc.nextDouble();

		// Cerramos teclado, ya no nos hace falta
		sc.close();

		if (importe >= 15000) {
			importe = importe * 1.16;
			System.out.print("Total a pagar: " + importe + "€");
		} else {
			importe = importe * 1.10;
			System.out.println("Total a pagar: " + importe + "€");
		}

	}

}
