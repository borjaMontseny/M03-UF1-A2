import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani hora, minuts i segons i digui quina hora,
		 * minuts i segons serà quan hagi passat un segon més.
		 */

		System.out.print("Hores: ");
		Scanner sc = new Scanner(System.in);
		int hores = sc.nextInt();

		System.out.print("Minuts: ");
		int minuts = sc.nextInt();

		// Si introduim els minuts correctament, podem demanar segons, sinó anem al else
		if (minuts >= 0 && minuts < 60) {
			System.out.print("Segons: ");
			int segons = sc.nextInt();
			// Si introduim els segons bé, continua el programa, sinó anem al else
			if (segons >= 0 && segons < 60) {
				System.out.println("+ 1 segon =");
				segons = segons + 1;
				// si els segons al sumar-li 1 son = o superior a 60, sinó else que printeja
				// el resultat
				if (segons >= 60) {
					// restem 60 als segons
					segons = segons - 60;
					// sumem 1 als minuts
					minuts = minuts + 1;
					// si els minuts = o > a 60. restem 60 mins y sumem 1 hora
					if (minuts >= 60) {
						minuts = minuts - 60;
						hores = hores + 1;
						System.out.println(hores + " hores, " + minuts + " minuts, " + segons + " segons. 1v");
					} else {
						System.out.println(hores + " hores, " + minuts + " minuts, " + segons + " segons. 2v");
					}
				} else {
					System.out.println(hores + " hores, " + minuts + " minuts, " + segons + " segons. 3v");
				}
				// Si introduim malament els segons (0 a 59)
			} else {
				System.out.println("Error al introduir segons. Reinicia el programa");
			}
			// Si introduim malament els minuts (0 a 59)
		} else {
			System.out.println("Error al introduir minuts. Reinicia el programa");
		}
		sc.close();
	}

}
