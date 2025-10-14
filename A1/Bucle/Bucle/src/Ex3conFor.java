public class Ex3conFor {
    public static void main(String[] args) {
        /**
         * Realiza un programa que muestre los números pares 
         * comprendidos entre el 1 y el 200. Esta vez
         * utiliza un contador sumando de 1 en 1. 
         */
        int contador;
        for (contador = 1; contador <= 200; ++contador) {
            //++contador es lo mismo que contador = contador + 1
            //contador++ es lo mismo que contador = contador + 1
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
    }
}
