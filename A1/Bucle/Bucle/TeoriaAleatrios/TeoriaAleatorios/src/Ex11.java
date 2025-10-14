import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        /**
         * Generar 10 números aleatorios entre 100 y 200
         * sumar los pares por un lado y
         * sumar los impares por otro lado
         * Con bucle FOR
         */
        Random rd = new Random();
         int sumaPares = 0;
        int sumaImpares = 0;
        int numeroAleatorio;
        int contador;
        for( contador=0; contador<10; contador++){
            numeroAleatorio = rd.nextInt(100,201);
            System.out.println("--->" + numeroAleatorio);
            if(numeroAleatorio % 2 == 0){
                sumaPares += numeroAleatorio;
            } else {
                sumaImpares += numeroAleatorio;
            }
        }
        System.out.println("Suma Pares: " + sumaPares + " Suma Impares: " + sumaImpares);
    }
}
