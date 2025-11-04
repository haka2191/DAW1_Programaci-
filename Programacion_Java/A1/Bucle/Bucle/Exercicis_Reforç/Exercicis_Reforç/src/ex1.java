import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        /**
         * Escriu un programa que mostri per pantalla 
         * els 10 múltiples de 7 a partir del numero que indiqui el usuari.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un número per començar: ");
        int numero = sc.nextInt();
        
        System.out.println("Els 10 múltiples de 7 a partir de " + numero + " són:");
        for (int i = 0; i < 10; i++) {
            int multiple = numero + i * 7;
            System.out.println(multiple);
        }
        
        System.out.println("-----------De Profe----------------");
        System.out.print("Introdueix un número per començar: ");
        int numero2 = sc.nextInt();
        int contador_multi=0;

        do{
            if (numero2 %7==0) {
                contador_multi++;
            }
            numero2++;
        }while(contador_multi<10);
        sc.close();
    }
}
