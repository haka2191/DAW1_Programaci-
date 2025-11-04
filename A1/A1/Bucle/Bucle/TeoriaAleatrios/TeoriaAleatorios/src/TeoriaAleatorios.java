import java.util.Random;

public class TeoriaAleatorios {
    public static void main(String[] args) throws Exception {
        /**
         * Manera de generar Valores Aleatorios en Java
         */

         //Exemple 1 generar un valor aleatorio del 1 al 10
        System.out.println("------------1 al 10 ---------");
         Random rd = new Random();
         int valorAleatorio;
         for(int i=0; i<10; i++) {
            valorAleatorio = rd.nextInt(1,11);
            System.out.println(valorAleatorio);
         }

         System.out.println("------------15 al 35 ---------");
         //Exemple 2 generar 10 aleatorio del 15 al 35
         for(int i=0; i<10; i++){
            valorAleatorio = rd.nextInt(15,36);
            System.out.println(valorAleatorio);
         }

         System.out.println("-------------10 al 0 ---------");
         //Exemple 3 generar 10 aleatorio del -10 al 0(incluido)
         for(int i=0; i<10; i++){
            valorAleatorio = rd.nextInt(-10,1);
            System.out.println(valorAleatorio);
         }

         Double aleatoriDouble;
         System.out.println("--------------1 al 10 --------");
         //exemple 4 generar 15 aleatorio con decimales del 1 al 10
        for(int i=0; i<15; i++){
            aleatoriDouble = rd.nextDouble(1,11);
            System.out.println(aleatoriDouble);
        }
}
}
