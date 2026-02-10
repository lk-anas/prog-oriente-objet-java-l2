import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        System.out.print("A : ");
        int A = lecteur.nextInt();

        System.out.print("B : ");
        int B = lecteur.nextInt();

        System.out.print("C : ");
        int C = lecteur.nextInt();

        System.out.println("La valeur de A est : " + A);
        System.out.println("La valeur de B est : " + B);
        System.out.println("La valeur de C est : " + C);

        /*int temp = A;
        A = B;
        B = C;
        C = temp;*/

        System.out.println("La valeur de A transformée est : " + B);
        System.out.println("La valeur de B transformée est : " + C);
        System.out.println("La valeur de C transformée est : " + A);
    }
}