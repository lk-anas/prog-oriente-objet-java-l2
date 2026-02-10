import java.util.Scanner;

public class Exo4 {
	public static void main(String[] args){
		Scanner scanner_line = new Scanner(System.in);
		Scanner scanner_numeric = new Scanner(System.in);
		
		int sz;
		
		do {
			System.out.print("Entrez le nombre d'étudiants : ");
			sz = scanner_numeric.nextInt();
		}while(sz < 1);
		
		String[] tNoms = new String[sz];
	    double[] tNotes = new double[sz];
		
		for (int i=0 ; i<sz ; i++){
			System.out.print("Entrez le nom de l'étudiant " +(i+1) + " : ");
			tNoms[i] = scanner_line.nextLine();
			System.out.print("Entrez la note de " +tNoms[i]+" : ");
			tNotes[i] = scanner_numeric.nextDouble();
		}	
		
		
        System.out.print("[");
        for (int i = 0; i < nbEtud - 1; i++) {
            System.out.print(tEtud[i] + ":" + tNotes[i] + ",");
        }
        ;
        if (nbEtud != 0)
            System.out.println(tEtud[nbEtud - 1] + ":" + tNotes[nbEtud - 1]);
        system.out.print("]");
	}
}


