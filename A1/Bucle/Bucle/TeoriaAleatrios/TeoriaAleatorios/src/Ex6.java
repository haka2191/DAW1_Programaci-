import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que lea 10 números no nulos y 
         * luego muestre un mensaje de si ha leído
         * algún número negativo o no.
         */
        /**
         * Boolean negativo = false
         * bucle contador = 1 hasta <=4 <5
         * genera aleatorio entre -5,5
         * si numero <0 negativo = true
         * si negativo = true "ha leido negativo" 
         * si negativo = false "no ha leido negativo"
         * Sino todo positivo
         */
        Random rd = new Random();
        boolean negativo = false;
        int numero;
        for(int i=0; i<4; i++){
            numero = rd.nextInt(-5,6);
            System.out.println("--->" + numero);
            if(numero < 0){
            //if(numero < 0 && negativo == false){ Si fas aixo nomes 
            //el primer cop que troba un negatiu No entra mes al if
                negativo = true;
        } 
        //do{
        //umero = rd.nextInt(-5,6);
        //    System.out.println("--->" + numero);
        //    if(numero < 0 && negativo == false){
        //        negativo = true;
        //    }contador++;
        //}while(contador<4 && negativo == false)
        }
        if (negativo==true) {
             System.out.println(" Agluno era negativo");
            }else{
                System.out.println(" Todas no eran negativas");
            }
    }
}
