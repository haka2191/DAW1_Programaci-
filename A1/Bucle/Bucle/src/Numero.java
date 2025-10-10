import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pide numero hasta que no poner un 0 "para salir"
        
        int numero;
        int suma = 0;
        do {
            System.out.print("Poner un numero (0 para salir): ");
            numero = sc.nextInt();
            //System.out.println("Numero: " + numero);
        } while (numero != 0); 
        System.out.println("Has salido del programa.");

        System.out.println("====Con SUMA ========");
        do {
            System.out.print("Poner un numero (0 para salir): ");
            numero = sc.nextInt();
            suma= suma + numero;
            System.out.println(" Suma de los numeros -----> " + suma);
            //System.out.println("Numero: " + numero);
        } while (numero != 0); 
        System.out.println("Has salido del programa.");
    }
}
