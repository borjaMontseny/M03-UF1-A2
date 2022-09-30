import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix un enter: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " és múltiple de 2");
		} else {
			System.out.println(num + " no és múltiple de 2");
		}
		
		if (num % 5 == 0) {
			System.out.println(num + " és múltiple de 5");
		} else {
			System.out.println(num + " no és múltiple de 5");
		}
		
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println(num + " és multiple de 2 i 5 a la vegada");
		} else {
			System.out.println(num + " no és múltiple de 2 i 5 a la vegada");
		}
		
		sc.close();

	}

}
