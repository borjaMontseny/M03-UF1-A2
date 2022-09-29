import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escriu un programa que demani un número i digui si és parell o senar.
		
		System.out.print("Introdueix un enter: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		if (num % 2 == 0) {
			System.out.println("És parell");
		} else {
			System.out.println("És senar");
		}
		
		sc.close();
	}

}
