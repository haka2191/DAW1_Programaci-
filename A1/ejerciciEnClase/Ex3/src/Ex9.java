import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
    /*Programa que rep com a dades d'entrada una hora expressada en hores, 
    minuts i segons i un temps expressat en segons i que ens calcula 
    i escriu l'hora, minuts i segons que seran, transcorregut el temps especificat.
    //Pedir hora, minut, segons
    //sumar 1 al segundo
    //Si segundo >=60
    - sumar 1 al minuto
    -iniciar a 0 segundo
    - Si minuto >=60 
    -suma 1 a hora
    -iniciar a 0 minut
    -si hora >= 24
    -iniciar a 0 hora 
    //fsi X4
    //Mostrar hora, minuto, Segundo
    */
        Scanner scanner = new Scanner(System.in);
        int hora, minuto, segundo, tiempo;
        System.out.print("Dime la hora: "); 
        hora = scanner.nextInt();
        System.out.print("Dime los minutos: ");
        minuto = scanner.nextInt();
        System.out.print("Dime los segundos: ");
        segundo = scanner.nextInt();
        System.out.print("Dime el tiempo en segundos a sumar: ");
        tiempo = scanner.nextInt();
        segundo += tiempo;
    }
}
