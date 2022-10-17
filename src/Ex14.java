import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani dos números i una lletra. Si la lletra és "s" :
		 * els suma, si és "r": els resta, si la lletra és "m": multiplica i si la
		 * lletra és "d": els divideix.
		 */

		System.out.print("Valor A: ");
		Scanner sc = new Scanner(System.in);
		double valorA = sc.nextDouble();

		System.out.print("Valor B: ");
		double valorB = sc.nextDouble();

		System.out.print("Operacions: Suma = s | Resta = r | Multi = m | Divi = d | ");
		String operador = sc.next();
		sc.close();

		char suma = 's';
		char resta = 'r';
		char multi = 'm';
		char divi = 'd';

		if (operador.charAt(0) == suma) {
			System.out.println(valorA + valorB);
		} else if (operador.charAt(0) == resta) {
			System.out.println(valorA - valorB);
		} else if (operador.charAt(0) == multi) {
			System.out.println(valorA * valorB);
		} else if (operador.charAt(0) == divi) {
			System.out.println(valorA / valorB);
		}

	}

}
