import java.util.Scanner;

public class PedirDatosUsuarios {

    /**
     * @param frase
     * @return
     */
    public static int PedirDatosPositivo(String frase){ 
        int valor;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(frase);
            valor = sc.nextInt();
        } while (valor < 0);
        return valor;
    }

    public static char pedirLetra(String frase){
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        char letra = sc.next().charAt(0);
        return letra;
    }
}
