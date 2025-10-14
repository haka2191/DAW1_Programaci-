import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /**
         * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y
         *  el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
         * números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
         * ordenador si es mayor, menor o igual al número que ha pensado).
         */   
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
         int min = 1;
        int max = 100;
        int numeroAdivinar;
        int ordenaPiensa;
        boolean adivinado = false;
        System.out.println("Piensa un numero del 1 al 100");
        numeroAdivinar = sc.nextInt();
        while(!adivinado){
            ordenaPiensa = rd.nextInt(min, max + 1);
            System.out.println("El ordenador propone: " + ordenaPiensa);
            if(ordenaPiensa < numeroAdivinar){
                System.out.println("Es mayor");
                min = ordenaPiensa + 1;
            } else if (ordenaPiensa > numeroAdivinar){
                System.out.println("Es menor");
                max = ordenaPiensa - 1;
            } else {
                System.out.println("El ordenador ha adivinado el numero: " + ordenaPiensa);
                adivinado = true;
            }
        }
            System.out.println("-------OPCION DE PROFE-------");
            int limite_inferior = 1;
            int limite_superior = 100;
            int ordenador_piensa;
            
            do{
                ordenador_piensa= rd.nextInt(limite_inferior, limite_superior + 1);
                System.out.println("He pensado el numero: " + ordenador_piensa + " he acertado (=,m(Menor),y(Meyor))?");
                char respuesta = sc.next().charAt(0);
                if(respuesta == '='){
                    System.out.println("Has acertado");
                }else if(respuesta == 'm'){
                    limite_superior = ordenador_piensa;
                    System.out.println("Es menor");
                }else{
                    System.out.println("Es mayor");
                }
            }
    }
}
