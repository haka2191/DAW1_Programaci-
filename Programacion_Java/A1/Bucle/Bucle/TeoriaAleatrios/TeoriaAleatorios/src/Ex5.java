import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que lea un número positivo N y calcule y 
         * visualice su factorial N!
         * Siendo el factorial:
         * 0! = 1
         * 1! = 1
         * 2! = 2 * 1
         * 3! = 3 * 2* 1
         * N! = N * (N-1) * (N-2)........* 3*2*1
         */
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que factorial quieres saber ");
        int numero = sc.nextInt();
        int factorial=0;
        int resultado =0;

        for(int i= 1; i<= numero; i++){//asi obtendre el 1,2,3,4,5
            factorial = i;
            resultado = i * (i-1);
            System.out.println(i  + " X " + (i-1) + "  " + resultado);
        }
        System.out.println("Factorial -> " + resultado );

        
    }
}
