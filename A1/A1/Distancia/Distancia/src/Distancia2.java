import java.util.Scanner;

public class Distancia2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos vueltas has dado? ");
        int laps = sc.nextInt();

        final int DISTANCIA_VUELTA = 400;
        final int METROS_KM=1000;

        int distancia = laps * DISTANCIA_VUELTA;
        int km = distancia /METROS_KM;
        int metrosSobrantes = distancia% METROS_KM;

        System.out.println("Has corrido  "+ distancia + "metros");
        System.out.println("km -> " + km + " y " + metrosSobrantes + " metros");
    }
}
