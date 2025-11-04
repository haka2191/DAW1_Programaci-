import java.util.Scanner;

public class preuDescompte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preu;
        System.out.println("El preu total de productes? ");
        preu = sc.nextDouble();

        System.out.println("Cuantos descompte tienes? ");
        int descompte =sc.nextInt();

        double total = preu % descompte;
        System.out.println("Total con descompte " + total);
    }
}
