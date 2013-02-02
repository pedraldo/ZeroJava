//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;
//Ceci importe toutes les classes du package java.util 
//import java.util.*;

public class sdz1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Hello World !");
		System.out.println("\nMy name is Peter !");
		
		
		
		//CONVERSION DE VARIABLE => CAST
				/*int i = 123;
				float j = (float)i;
				
				double i = 1.23;
				double j = 2.9999999;
				int k = (int)i; // k vaut 1 
				k = (int)j; // k vaut 2
				
		
				double a = 10;
				double b = 4;
				int result = (int)(a/b);
				System.out.println("\nLe resulstat de 10/4 est : " + result);
				
		
				int c = 3;
				int d = 2;
				double result = (double)(c/d);
				System.out.println("\nLe resultat de 3/2 est : "+ result); // result = 1.0
				
				! !	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	! 
		
			!	int c = 3;
			!	int d = 2;
			!	double result = (double) (c) / (double) (d);
			!	System.out.println("\nLe resultat de 3/2 est : " +result); // result avec 1.5
			!	
			!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!
			*/
		
		//CONVERSION INT EN STRING => valueOf()
			/*int i = 12;
			String j = new String(); //crŽer simplement une variable j de type string
			j = j.valueOf(i); //j contient la chaine de caractre "12"
			
			//Chemin inverse => k prend la valeur contenu dans j
			//equivalent pour autre type :  floatValue(), doubleValue()...
			int k = Integer.valueOf(j).intValue(); 
			*/
			
		
		//LIRE LES ENTREES DU CLAVIERS
			/*
			Scanner sc = new Scanner(System.in);
			System.out.println("\nVeuillez taper un mot : ");
			String str = sc.nextLine(); //POUR CHAR => charAt(0)
			System.out.println("Vous avez saisi : " + str);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\nVeuillez taper un entier : ");
			int i = sc.nextInt(); //nextDouble() ; nextLong() ; nextByte ()
			System.out.println("Saisissez une chaine : ");
			sc.nextLine();// <= !!!!!!!!!!!!!!!!!!! vide la ligne car nextInt ne le fait pas
			String str = sc.nextLine();
			System.out.print("FIN");
			*/
		
			
		//LA CONDITION TERNAIRE
			/*int x = 10, y = 20;
			int max = (x < y) ? y : x ; //Maintenant max vaut 20
			System.out.println("\nMax = " +max);*/
			/* est ce que x est infŽrieur ˆ y ?
			 * oui => max = y
			 * non => max = x
			 */
			
			/*Savoir si un nombre est paire ou non
			int z = 10;
			String type = (z%2 == 0) ? "Le nombre est paire" : "Le nombre est impaire";
			*/
		
			/*	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	
			Scanner sc = new Scanner(System.in);
		!	char reponse = 'O';
		!	String prenom;
		!	
		!	while(reponse == 'O')
		!	{
		!		System.out.println("\nEntrez un prenom : ");
		!		prenom = sc.nextLine();
		!		System.out.println("\nBonjour "+prenom+", comment vas-tu ?");
		!		
		!		reponse = ' ';
		!		
		!		while (reponse != 'O' && reponse != 'N')
		!		{
		!			System.out.println("\nVeux tu reessayer ? (O/N) : ");
		!			reponse = sc.nextLine().charAt(0);
		!		}
		!	}
		!	
		!	System.out.print("\nAu revoir ... !");
		!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	!	
			*/
		
		
		//TABLEAUX
			
			//DŽclaration d'un tableau ˆ deux dimensions
			//int premiersNombres [][] = { {0,2,4,6,8},{1,3,5,7,9} };
		
			/*char tableauCaractere [] = {'a','b','c','d','e','f','g'};
			char lettre;
			int i=0;
			Scanner scan = new Scanner(System.in);
			
			do
				{
					System.out.println("Rentrez une lettre en minuscule SVP : ");
					lettre = scan.nextLine().charAt(0);
					
					while(tableauCaractere[i] != lettre)
					{
						i++;			
					}
					
					if(i<tableauCaractere.length) System.out.println("La lettre "+lettre+" est prŽsente dans le tableau");
					else System.out.println("La lettre "+lettre+" n'est pas prŽsente dans le tableau");
					
				}while(i >= tableauCaractere.length);
			*/
		
			//Suite de nombre avec un tableau ˆ deux dimensions
			/*int premiersNombres [][] = { {0,2,4,6,8}, {1,3,5,7,9} };
			int i=0,j=0;
			
			for (j=0;j<5;j++)
			{
				for(i=0;i<2;i++)
				{
					System.out.print(premiersNombres[i][j]);
				}
			}
			*/
		
			//NOUVELLE SYNTAXE FOR & ECRITURE TABLEAU DANS CONSOLE
			String tab [] = {"titi","tata","toto","tete"};
			
			for(String str : tab) System.out.println(str);
			
	}

}
