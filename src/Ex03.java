import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix un enter: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// IF anidado, menos redundante
		if (num % 2 == 0) {
			if (num % 5 == 0) {
				System.out.println(num + " és múltiple de 2 y de 5");
			} else {
				System.out.println(num + " és múltiple de 2");
			}
		} else if (num % 5 == 0) {
			System.out.println(num + " és múltiple de 5");
		} else {
			System.out.println(num + " no és múltiple ni de 2 ni de 5");
		}

		sc.close();

	}

}