import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que lea 10 números no nulos y luego 
         * muestre un mensaje indicando
         * cuántos son positivos y cuantos negativos. 
         */
        Random rd = new Random();
        int positivos = 0;
        int negativos = 0;
        int aleatoria;
        int contador;
        for( contador=1; contador<=10; contador++){
            aleatoria = rd.nextInt(-3,11);
            System.out.println("--->" + aleatoria);
        
        if(aleatoria < 0){
                ++negativos;
            } else if (aleatoria > 0) {
                positivos++;
            }
        }
        System.out.println("positivos: " + positivos + " negativos: " + negativos);
    }
}
