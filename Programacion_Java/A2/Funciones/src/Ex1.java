import java.util.Scanner;

public class Ex1 {

    // Función que devuelve la multiplicación de dos números reales
    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = multiplica(num1, num2);

        System.out.println("El resultado de la multiplicación es: " + resultado);

        sc.close();
    }
}

