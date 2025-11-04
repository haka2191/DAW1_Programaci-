import java.util.Scanner;

public class Grados {
    public static void main(String[] args) {
    //Perguntar grado Fahrenheit
    //Fórmula para calcular (F -32) 5/9
    //Para calcular c1= (F -32)
    //c2=c1*5
    //c3=c2/9
    //Mostrar grado Celsius
    Scanner sc = new Scanner(System.in);
    int gF;

    System.out.println("Cuantos grado farenheit son? ");
    gF = sc.nextInt();

    int c1 = gF - 32;
    int c2 = c1 *5;
    double c3 = (double) c2 /9;

    System.out.println("Temperatura de graus Celsius es " + c3 + "ºC");


    }
}
