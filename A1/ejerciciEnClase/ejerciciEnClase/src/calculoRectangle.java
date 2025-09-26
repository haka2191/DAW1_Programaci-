import java.util.Scanner;

public class calculoRectangle {
    public static void main(String[] args) {
    //Perguntar base
    //Perguntar altura
    //Calcular area = base * altura
    //Mostrar area
 
    Scanner sc = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Cuanto base hay el quadrat? ");
        base = sc.nextDouble();

        System.out.println("Cuanto altura hay el quadrat? ");
        altura = sc.nextDouble();
        
        //System.out.println(base + " - " + altura );
        double area = base * altura;

        System.out.println("La area de rectangle es "+ area );
}
}
