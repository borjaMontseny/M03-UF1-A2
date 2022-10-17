import java.util.Scanner;

public class Ex09 {

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

		} else if (anysTreballats >= 5) {
			souBase = souBase * 1.07;

		} else if (anysTreballats >= 3) {
			souBase = souBase * 1.05;
			
			// podria ser directamente un else, ya que és cualquier otro caso
		} else {
			souBase = souBase * 1.03;
		}
		
		System.out.println("El sou que et pertoca és de " + souBase + "€");

	}

}