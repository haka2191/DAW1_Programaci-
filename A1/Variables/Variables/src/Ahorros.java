import java.util.Scanner;

public class Ahorros {
    public static void main(String[] args) {
        /*tiene que saber cuantas monedas tienes de (50 centimos)
        y decirte cuanto has ahorrado*/
        
        Scanner contarMoneda = new Scanner(System.in);

        //contar monedas (Usuario)
        int monedas;
        final double VALOR_MONEDAS_50 = 0.50;
        System.out.println("Cuantos monedas has contado? ");
        monedas = contarMoneda.nextInt();
        //multiplicar monedas por 0,50 (ahorros)
        double Multi = monedas*VALOR_MONEDAS_50;
        //dar el resultado
        System.out.println("Tienes ahorros " + Multi + "Euros");
    }
}
