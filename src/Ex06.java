import java.util.Scanner;

public class Ex06 {

	/*
	 * Escriu un programa que demani 3 números i digui si la multiplicació dels dos
	 * primers és igual al tercer
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introdueix numA: ");
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		System.out.print("Introdueix numB: ");
		int numB = sc.nextInt();

		System.out.print("Introdueix numC: ");
		int numC = sc.nextInt();
		
		sc.close();

		if ((numA * numB) == numC) {
			System.out.println("La suma dels dos primers valors és igual al tercer valor");
			System.out.println(numA + " * " + numB + " = " + (numA * numB) + " | Tercer valor = " + numC);
		} else {
			System.out.println("La suma dels dos primers valors NO és igual al tercer valor");
			System.out.println(numA + " * " + numB + " = " + (numA * numB) + " | Tercer valor = " + numC);
		}
		
	}

}
