import java.util.Scanner;

public class Ex1 {

    // Función que devuelve la multiplicación de dos números reales
    public static double multiplica(double a, double b) {
        //double resultado = a * b;
        //return resultado;
        return a * b;
    }

    public static double pedirValorUsuario() {// Función que pide un número real al usuario
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();
        return numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = pedirValorUsuario(); // Pedir el primer número al usuario
        double num2 = pedirValorUsuario();// Para repetir  segunda vez

        double resultado = multiplica(num1, num2);

        System.out.println("El resultado de la multiplicación es: " + resultado);

        sc.close();
    }
}

