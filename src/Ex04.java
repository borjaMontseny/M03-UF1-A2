import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.print("Introdueix un enter del 1 al 7: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("Dilluns");
		} else if (num == 2) {
			System.out.println("Dimarts");
		} else if (num == 3) {
			System.out.println("Dimecres");
		} else if (num == 4) {
			System.out.println("Dijous");
		} else if (num == 5) {
			System.out.println("Divendres");
		} else if (num == 6) {
			System.out.println("Dissabte");
		} else if (num == 7) {
			System.out.println("Diumenge");
		} else {
			System.out.println("Error. Reinicia el programa.");
		}
		
		sc.close();
		
	}

}
