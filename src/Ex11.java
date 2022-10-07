import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani dia, mes i any, i digui si la data és correcta.
		 */

		System.out.print("Introdueix dia: ");
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();

		System.out.print("Introdueix mes: ");
		int mes = sc.nextInt();

		System.out.print("Introdueix any: ");
		int any = sc.nextInt();

		// Tanquem Scanner (teclat)
		sc.close();

		// objecte GC per simplificar la comprovació de any de traspàs
		GregorianCalendar calendar = new GregorianCalendar();

		// Comprobació de tots els mesos amb 31 dies
		if (dia >= 1 && dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12)) {
			System.out.println("La data és correcta");
			// Comprobació en cas de 29 de febrer && any de traspàs
		} else if (dia == 29 && mes == 2) {
			if (calendar.isLeapYear(any)) {
				System.out.println("La data és correcta");
			} else {
				System.out.println("La data és incorrecta");
			}
			// Comprobació dels mesos amb 30 dies
		} else if (dia >= 1 && dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			System.out.println("La data és correcta");
			// Comprobació de febrer
		} else if (dia >= 1 && dia <= 28 && mes == 2) {
			System.out.println("La data és correcta");
		} else {
			System.out.println("La data és incorrecta");
		}

	}

}