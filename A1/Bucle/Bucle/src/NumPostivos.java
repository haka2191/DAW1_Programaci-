import java.util.Scanner;

public class NumPostivos {
    public static void main(String[] args) {
        //un Programa que pida numero
        //y cuente cuantos numeros positivos has escrito
        //para terminar poner un 0
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorPositivos = 0;
        do {    
            System.out.print("Poner un numero (0 para salir): ");
            numero = sc.nextInt();
            if (numero > 0) { //si es positivo se cuenta
                contadorPositivos++;
            }
            System.out.println("Numero: " + numero);
        } while (numero != 0);
        System.out.println(" Contador de numeros positivos -----> " + contadorPositivos);
        System.out.println("Has salido del programa.");
    }
}
