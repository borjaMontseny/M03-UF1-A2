import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani els anys treballats d’un treballador que
		 * cobra 40.000 euros anuals i digui el sou que li correspon segons els següents
		 * criteris:
		 */

		double souBase = 40000;
		
		System.out.print("Anys treballats: ");
		Scanner sc = new Scanner(System.in);
		int anysTreballats = sc.nextInt();
		sc.close();
		
		if (anysTreballats >= 10) {
			souBase = souBase * 1.10;
			System.out.println("El sou que et pertoca es de " + souBase + "€.");
			
		} else if (anysTreballats < 10 && anysTreballats >= 5) {
			souBase = souBase * 1.07;
			System.out.println("El sou que et pertoca es de " + souBase + "€.");
			
		} else if (anysTreballats < 5 && anysTreballats >= 3) {
			
		}
		
		
		
	}

}
