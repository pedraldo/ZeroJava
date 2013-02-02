import java.util.Scanner;

public class cf {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double t1, t2, pas;
		int i, j;
		char reponseImp;
		char reponse = 'O';
		boolean listeValide;


		while (reponse == 'O') {
			System.out
					.println("\n ----------------------------------------------- ");
			System.out
					.println("| CONVERSION DEGRES CELSIUS ET DEGRES FARHENHEIT |");
			System.out
					.println(" ----------------------------------------------- ");

			do {
				t1 = ddeSaisie("\nA partir de : ");
				t2 = ddeSaisie("\njusqu'a : ");
				pas = ddeSaisie("\nPar pas de : ");
		
				listeValide = entreesValides(t1, t2, pas);
				
				if (!listeValide) {
					System.out.println("\nTraitement impossible");
				}

			} while (!listeValide);

			do {
				System.out.println("\nAssurez vous que l'imprimante est prete");
				System.out.println("Si vous etes pret, tapez O, sinon N : ");

				reponseImp = scan.nextLine().charAt(0);

			} while (reponseImp != 'O');

			System.out.println("\nTABLE DE CONVERSION CELSIUS/FARHENHEIT\n");

			System.out.println(" -------------------------------------- ");
			System.out.println("|     CELSIUS     |     FARHENHEIT     |");
			System.out.println(" -------------------------------------- ");

			// i = (int) t1;

			for (i = (int) t1; i <= t2; i = (int) (i + pas)) {
				j = (9 / 5) * i + 32;
				if (i < 10 && i > 0) {
					System.out.println("        " + i + "         |          "
							+ j + "         ");
				}

				else if (i < 100 && i > -10) {
					System.out.println("       " + i + "         |          "
							+ j + "         ");
				}

				else {
					System.out.println("      " + i + "         |          "
							+ j + "         ");
				}
			}

			do {
				System.out
						.println("\n\nSouhaitez vous Žditer une autre table ? : ");

				reponse = scan.nextLine().charAt(0);

			} while (reponse != 'O' && reponse != 'N');

			if (reponse == 'N')
				System.out.print("\n\nAu revoir !!");

		}
	}

	static boolean entreesValides (double t1, double t2, double pas)
	{
		return (t1 > t2 && pas < 0) || (t1 < t2 && pas > 0);
	}
	
	static double ddeSaisie (String message)
	{
		System.out.println(message);
		double temperature = scan.nextDouble();
		scan.nextLine();
		return temperature;
	}
	
}






