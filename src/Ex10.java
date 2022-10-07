import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Escriu un programa que demani una nota numèrica i digui a quin rang de nota es troba.
		
		System.out.print("Introdueix la nota: ");
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();
		
		if (nota < 5) {
			System.out.println("Insuficient");
		} else if (nota < 6) {
			System.out.println("Suficient");
		} else if (nota < 7) {
			System.out.println("Bé");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else if (nota < 10) {
			System.out.println("Excel·lent");
		} else if (nota == 10) {
			System.out.println("Matrícula d'honor");
		} else {
			System.out.println("Error");
		}
		
		sc.close();
	}

}
