import java.util.Scanner;

public class DescompteReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("El preu nominal: ");
        double preuNominal = sc.nextDouble();

        System.out.print("El preu de venda: ");
        double preuVenda = sc.nextDouble();

        double descompte = ((preuNominal - preuVenda) / preuNominal) * 100;

        System.out.println("El descompte aplicat es del " + descompte + "%");

    }
}
