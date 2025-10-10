import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion_menu;
        
        do{
        System.out.println("1.- Jugar");
        System.out.println("2.- Reforzar Equipo");
        System.out.println("3.- Jugar Online");
        System.out.println("0.- Salir");
        System.out.println("Que opcion elegir?");
        opcion_menu = sc.nextInt();
        } while(opcion_menu!=1 && opcion_menu!=2 && opcion_menu!=3);

        if (opcion_menu ==1) {
            System.out.println("Jugando");
        }else if (opcion_menu ==2) {
            System.out.println("Equipo reforzando");
        }else if (opcion_menu ==3) {
            System.out.println("Conectando online...");
        }
        sc.close();
    }
}
