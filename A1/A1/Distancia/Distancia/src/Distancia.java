import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Introdueix la distància d’una volta (en metres): ");
        int distanciaVolta = sc.nextInt();

        System.out.print("Introdueix el nombre de voltes: ");
        int voltes = sc.nextInt();

        int metres = voltes * distanciaVolta;
        int km = metres / 1000; 

        System.out.println("Has recorregut " + metres + " metres.");
        System.out.println("Que són " + km + " quilòmetres sencers.");*/

        System.out.println("Cuantos vueltas has dado? ");
        int laps = sc.nextInt();

        final int DISTANCIA_VUELTA = 400;

        int distancia = laps * DISTANCIA_VUELTA;
        System.out.println("Has corrido  "+ distancia + "metros");

    }
}
