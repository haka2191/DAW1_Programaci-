import java.util.Scanner;

public class ejerciciEnClase {
    public static void main(String[] args) throws Exception {
        //Calcula area quadrat
        //Perguntar lado 
        //Calcular area = lado * lado 
        //Mostrar area
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.println("Cuanto lado hay el quadrat? ");
        lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("La area de cuadrado es "+ area );
    }
}
