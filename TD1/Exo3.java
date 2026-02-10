import java.util.Scanner;

public class Exo3 {
	public static void main(String[] args){
		Scanner lecteur = new Scanner(System.in);
		
		System.out.print("Veuillez saisir l'année : ");
		int annee = lecteur.nextInt();
	
		boolean bix = ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
			
		int mois;
		do {
			System.out.print("Donnez le mois entre 1 et 12 : ");
			mois = lecteur.nextInt();
		} while (mois < 1 || mois > 12);

		int maxJours = 30;
		if((mois == 1) || (mois == 3) || (mois == 5) || (mois == 7) || (mois == 8) || (mois == 10) || (mois == 12) ){
			maxJours = 31;
		}
		if(mois == 2 && bix) maxJours = 29;
		if(mois == 2 && !bix) maxJours = 28;
		
		int jour;
		do {
			System.out.print("Donnez le jour entre 1 et " + maxJours + " : ");	
			jour = lecteur.nextInt();
		}while (jour<1 || jour > maxJours);
		
		/*int njour ;
		if (jour < maxJours) njour = jour ++ ;
		else njour = 1*/
		
		int njour = (jour % maxJours)+1;
		
		int nmois = mois;
		if (njour == 1) nmois = (nmois%12)+1 ;
		
		int nannee = annee ;
		if (njour == 1 && nmois == 1) nannee ++ ;
			
		System.out.println("date d'aujourd'hui : " + jour + "/" + mois + "/" + annee);
		System.out.println("date du lendemain : " + njour + "/" + nmois + "/" + nannee);

	}
}

