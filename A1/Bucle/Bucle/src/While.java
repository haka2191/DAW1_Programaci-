import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //que diga hola el numero de veces que el usuario diga
        System.out.println("Cuantas veces quieres que te salude?");
        int veces = sc.nextInt();
        
        int contador = 1;
        while (contador <= veces) {
            System.out.print("Hola " + contador);
            contador = contador + 1;
            System.out.println("-> " + contador);
            //++contador
            //contador++
            //contador += 1
        }


        System.out.println("=======Bucle con contador desde 0====");
        contador = 0;
        while (contador < veces) {
            System.out.print("Hola " + contador);
            contador = contador + 1;
            System.out.println("-> " + contador);
            //++contador
            //contador++
            //contador += 1
        }

    }
}
