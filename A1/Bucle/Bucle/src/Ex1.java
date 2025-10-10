import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Te pide un numero Ejemplo 5 te sale 0 a 5 
        //Despues te pide un numero Ejemplo 1 te sale 10 a 1

        System.out.print("Dime un numero 1 hasta el que quieres contar: ");
        int num1 = sc.nextInt();
        int contador = 0; //contador empieza en 0 o si quieres en 1
        while (contador <= num1) {
            System.out.println(contador);
            contador = contador + 1;
            System.out.println("-> " + contador);
        }
        System.out.print("Dime un numero 2 hasta el que quieres contar hacia atras: ");
        int num2 = sc.nextInt();
        contador = num2;
        while (contador >= 0) {//contador es el numero 2 y te va restando hasta llegar a 0
            System.out.println(contador);
            contador = contador - 1;
            System.out.println("-> " + contador);
        }
}
}