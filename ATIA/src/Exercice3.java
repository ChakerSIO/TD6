import java.util.Scanner;
public class Exercice28 {

	public static void main(string[] args)
	{
		int choix;
		Scanner sc = new Scanner(System.in);
		do 
		{
			
				System.out.println(".......Mon Menu......");
				System.out.println("\n0- Pour quitter\n");
				System.out.println("\n1- Pour afficher\n");
				System.out.println("\n2- Pour \n");
				System.out.println("\n3- Pour \n");
				System.out.println("\n4- Pour \n");
				
		
		do 
		{
			System.out.println("Entrez votre choix");
			choix= sc.nextInt()
			if (choix>4){
				 
				System.out.println("votre choix n'est pas correct");
			}
			while (choix >4);
			
		switch (choix) {
		case 0;
		break;
		case 1;
		{
			System.out.println("Mon choix etait donc 1");
		}
		break;
		case 2;
		{
			System.out.println("Mon choix etait donc 2");
		}
		break;
		case 3;
		{
			System.out.println("Mon choix etait donc 3");
		}
		break;
		case 4;
		{
			System.out.println("Mon choix etait donc 4");
		}
		break;
		}
		}
		while(choix!=0);
		sc.close();
		}
		
		
		
				
		
		 

