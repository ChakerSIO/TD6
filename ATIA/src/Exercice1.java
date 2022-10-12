import java.util.Scanner;
public class Exercice1
{

    public static double prixTotalTTC(double prixHT, double n)
        /*Fonction qui prend en entrée le prix HT prixHT d'un article 
         * et le nombre d'articles n et qui calcule
         * le prix total TTC  correspondant.
         */
    {
        final double TVA =0.196;
        return (prixHT * n * (1+TVA));
    }


    public static void main(String[] args)
    {
        int prixHT = 10;
        int n = 2;

        Scanner reader = new Scanner (System.in);

        System.out.println("Entrer le PrixHT");
        prixHT = reader.nextInt();

        System.out.println("Entrer le nombre d'article");
        n = reader.nextInt();

        System.out.println("Le PrixTotal TTC est " + prixTotalTTC(prixHT,n));

    }

}
