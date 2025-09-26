import java.util.Scanner;

public class Distancia3 {
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
   
        System.out.print("Cuantos vueltas has dado? ");
        int laps = sc.nextInt();

        int distanciaVuelta;
        final int METROS_KM=1000;

        int distancia = laps * distanciaVuelta;
        int km = distancia /METROS_KM;
        int metrosSobrantes = distancia% METROS_KM;

        System.out.println("Has corrido  "+ distancia + "metros");
        System.out.println("km -> " + km + " km y " + metrosSobrantes + " metros");
    }
}
