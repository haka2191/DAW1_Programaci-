public class TeoriaFor {
    public static void main(String[] args) {
        /**
         * Mostrar numeros del 1 al 20
         */
        System.out.println("---------1 a 20----------");
        int contador = 1;
        for (contador = 1; contador <= 20; contador++) {
            //inicio; condicion continua; incremento contador
            System.out.println(contador);
        }

    
        System.out.println("---------5 a 14----------");
        /**
         * Mostrar numeros del 5 al 15 (no incoluir)
         */
        for (contador = 5; contador < 15; contador ++) {
            System.out.println(contador);
        }
    
        System.out.println("---------20 a 10----------");
        //Mostra del 20 al 10 (inclos) compte enrere
        for (contador = 20; contador >= 10; contador --) { 
            //contador -- = contador -1
        System.out.println(contador);
        }
    }
}
