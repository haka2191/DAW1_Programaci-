import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, valor3;
        System.out.print("Dime un valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.print("Dime un valor 2: ");
        valor2 = scanner.nextDouble();
        System.out.print("Dime un valor 3: ");
        valor3 = scanner.nextDouble();
        if (valor1 >= valor2 && valor1 >= valor3) {
            if (valor2 >= valor3) {
                System.out.println(valor3 + " - " + valor2 + " - " + valor1);
            } else {
                System.out.println(valor2 + " - " + valor3 + " - " + valor1);
            }
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            if (valor1 >= valor3) {
                System.out.println(valor3 + " - " + valor1 + " - " + valor2);
            } else {
                System.out.println(valor1 + " - " + valor3 + " - " + valor2);
            }
        } else {
            if (valor1 >= valor2) {
                System.out.println(valor2 + " - " + valor1 + " - " + valor3);
            } else {
                System.out.println(valor1 + " - " + valor2 + " - " + valor3);
            }
        }
    }
}
