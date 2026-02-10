import java.util.Scanner;

public class Utiltab{
	
	//Q1
	public static String[] creerTabString(){
		Scanner lecteur = new Scanner(System.in);
		Scanner lecteurs = new Scanner(System.in);


		System.out.println("Entrer la taille du tableau");
		int x = lecteur.nextInt();
		
		String[] res = new String[x];
		
		for (int i=0 ; i<x; i++){
			System.out.println("Entrer l'élément" + i);
			res[i] = lecteurs.nextLine();
		}
		return res;
	}
	
	//Q2
	public static double[] creerTabDouble(){
		Scanner lecteur = new Scanner(System.in);

		System.out.println("Entrer la taille du tableau");
		int x = lecteur.nextInt();
		
		double[] res = new double[x];
		
		for (int i=0 ; i<x; i++){
			System.out.println("Entrer l'élément" + i);
			res[i] = lecteur.nextDouble();
		}
		return res;
	}
	
	//Q3
	//tab != null
	public static void afficher(String[] tab){
		if (tab != null ){
			System.out.print("[");
			for (int i=0 ; i<tab.length ; i++){
				System.out.print(tab[i]);
				if(i != tab.length - 1){
					System.out.print(",");
				}
			}
			System.out.print("]");
		}
	}
	
	//tab != null
	public static void afficher(double[] tab){
		if (tab != null ){
			System.out.print("[");
			for (int i=0 ; i<tab.length ; i++){
				System.out.print(tab[i]);
				if(i != tab.length - 1){
					System.out.print(",");
				}
			}
			System.out.print("]");
		}
	}
	
	//Q4
	//tab1 != null ^ tab2 != null
	//0 <= i1deb <= tab1.length-1 ^ 0 <= i2deb <= tab2.length-1
	//0 <= i1fin <= tab1.length-1
	//i1deb <= i1fin
	public static void copierZone(String[] tab1, String[] tab2, int i1deb, int i1fin, int i2deb){
		String[] tab = new String[]
	}
	
	//tab1 != null ^ tab2 != null
	//0 <= i1deb <= tab1.length-1 ^ 0 <= i2deb <= tab2.length-1
	//0 <= i1fin <= tab1.length-1
	//i1deb <= i1fin 
	public static void copierZone(double[] tabS, double[] tabD, int i1deb, int i1fin, int i2deb){
		
		i1deb = Maths.max(0,i1deb);
		i1fin = Maths.min(tabS.length-1,i1fin);
		i2deb = Maths.max(0,i2deb);
		
		int nbe = Maths.min((fin1-deb1)+1,tabD.length-deb2);
		
		String[] newtab = new String[i1fin-i1deb];
		for(int i = 0; i < nbe;i++){
			tabD[deb2+i] = tabS[deb1 +i];
		}	

	}
	//Q5
	//tab != null
	//n >= 0
	public static String[] agrandir(String[] tab , int nbr){
		if (tab != 0) {
			n = Math.max(0,n);
			int newtaille = tab.length + n;
			String[] res = new String[newtaille];
			for (int i = 0; i<tab.length; i++){
				res[i] = tab[i];
			}
			return res;
		}
		return null;
	}
	
	public static double[] agrandir(double[] tab, int nbr){
		if (tab != 0) {
			n = Math.max(0,n);
			int newtaille = tab.length + n;
			double[] res = new double[newtaille];
			for (int i = 0; i<tab.length; i++){
				res[i] = tab[i];
			}
			return res;
		}
		return null;		
	}
		
	//Q6
	//t1 != null
	//t2 != null
	//tri(t1) && tri(t2)
	public static String[] fusion(String[] t1, String[] t2){
		if(t1!=null && t2!=null){
			
		}
	}
	
	public static double[] fusion(double[] t1, double[] t2){
		
	}
	
	//Q7
	//tab != null
	//0 <= ind <= tab.length-1
	public static String[] inserer(String[] tab, double elm, String ind){
		if (tab != null){
			
		}
		
	}
	
	public static double[] inserer(double[] tab, int indice, int x){
		
	}
	
	//Q8
	//tab !=null
	//0 <= ind <= tab.length-1
	public static double[] supprimer(double[] tab, int indice){
		
	}	

	public static void main (String[] args){
		double[] d = creerTabDouble();
		String[] s = creerTabString();
		afficher(d);
		afficher(s);
		afficher(agrandir(s,4));
		afficher(agrandir(d,-6));
	
		String[] tab1 = {"A","B","C","D","S"};
		String[] tab2 = {"A","b","c","d"};
		
		copierZone(tab1,tab2,1,1,2);
		
	}
}