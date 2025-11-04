import java.util.Scanner;

public class Milles {
    public static void main(String[] args) {
    //Pedir milles
    //Calcular metros (MillesRecorridas  *1609)
    //Mostrar milles

    Scanner sc = new Scanner(System.in);
    final int MILLES_METROS = 1609;
    double milles;
    System.out.println("Cuantas millas has recorrido: ");
    milles = sc.nextDouble();

    double metros = milles * MILLES_METROS;
    System.out.println(metros + " metros");
    }
}
