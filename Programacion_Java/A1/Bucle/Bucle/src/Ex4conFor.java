import java.util.Scanner;

public class Ex4conFor {
    public static void main(String[] args) {
        /**
         * Realiza un programa que muestre los números 
         * desde el 1 hasta un número N 
         * que se introducirá por teclado.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();
        //O si ponemos N = 50, mostrará del 1 al 50
        int contador;
        for (contador = 1; contador <= N; ++contador) {
            System.out.println(contador);
        }
    }
}
