import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int max_partidas, puntos_victoria, num_maquina, num_usuario, suma, punts_maquina=0, punts_usuario=0, contador_partides=0;

        System.out.println("Cuanto va a ser el maximo de partidas?");
        max_partidas = scanner.nextInt();
        System.out.println("Cuantans puntos para ganar?");
        puntos_victoria = scanner.nextInt();

        num_maquina = rd.nextInt(1,11);
        do{
        System.out.println("Quin numero vols tu? (1-10)");
        num_usuario = scanner.nextInt();
        }while(num_usuario < 0 || num_usuario > 10);
        System.out.println("la maquina ha escogido: " + num_maquina);

        do{
        suma = num_maquina + num_usuario;
        if (suma%5==0) {
            punts_maquina += 2;
        }else if (suma%3==0) {
            System.out.println("Nadie gana puntos");
        }
        else{
            punts_usuario ++;
        }contador_partides++;
        System.out.println("Usuario "+ punts_usuario);
        System.out.println("Maquina "+ punts_maquina);
        }while(contador_partides < max_partidas && punts_usuario<puntos_victoria&&punts_maquina<puntos_victoria);

        if (punts_usuario > puntos_victoria) {
            System.out.println("Has ganado");
        }else if (punts_maquina > puntos_victoria) {
            System.out.println("Ha ganado la maquina");
        }else{
            System.out.println("Nadie ha ganado");
        };
