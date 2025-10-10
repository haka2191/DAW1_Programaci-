import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Te pide un numero Ejemplo 5 te sale 0 a 5 

        System.out.print("Dime un numero 1 hasta el que quieres contar: ");
        int num1 = sc.nextInt();
        int contador = 0; //contador empieza en 0 o si quieres en 1
        while (contador <= num1) {
            System.out.println(contador);
            contador = contador + 1;
            //Opcional
            //System.out.println("-> " + contador);
        }
        
        //Despues te pide un numero Ejemplo 1 te sale 10 a 1
        System.out.print("Dime un numero 2 hasta el que quieres contar hacia atras: ");
        int num2 = sc.nextInt();
        contador = num2;
        do { //contador empieza en num2
            System.out.println(contador);
            contador = contador - 1;
            //Opcional
            //System.out.println("-> " + contador);
        }while (contador >= 0);
        //}while (!(contador <= 0));
}
}