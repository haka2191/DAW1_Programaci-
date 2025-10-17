import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        /**
         * Pide un programa que pida introducir Pin hasta 3 veces: Simularemos
         * la entrada de un portal de un banco donde te pide un pin (el pin sera 1234), 
         * te ha de pedir el pin hasta que adivinar el pin, o al tercer
         * golpe tiene terminar diciendo que se ha sobrepasado el número máximo de intentos.
         */
        Scanner sc = new Scanner(System.in);
        final int PIN_CORRECTE = 1234;
        int intents = 0;

        // Variable per controlar si l'accés és permès
        boolean accesPermes = false;
        
        // Bucle que permet fins a 3 intents o fins que encerti el PIN
        while (intents < 3 && !accesPermes) {
            System.out.print("Introdueix el PIN: ");
            int pinIntroduit = sc.nextInt();
            intents++;
            
            if (pinIntroduit == PIN_CORRECTE) {
                accesPermes = true; 
                System.out.println("PIN correcte. Accés permès.");
            } else {
                if (intents < 3) {
                    System.out.println("PIN incorrecte. Torna-ho a intentar.");
                }
            }
        }
        
        // Si no s'ha permès l'accés després de 3 intents, mostra missatge d'error
        if (!accesPermes) {
            System.out.println("S'ha sobrepassat el nombre màxim d'intents. Accés denegat.");
        }
        
        sc.close();

        System.out.println("------De Profe--------");
        System.out.print("Introdueix el PIN: ");
        int pin = sc.nextInt();
        int intentos=3, intents_positivo=0;
        if (pin!= PIN_CORRECTE) {
            intentos--;
            //intents_positivo++; (OPCIONAL)
            System.out.println("Te equivocaste te quedan " + intentos + "intentos");
        }else{
            System.out.println("Puedes sacar dinero");
        }while (intentos>0 && pin != PIN_CORRECTE) {
        //}while (intents_positivo>3 && pin != PIN_CORRECTE) { (OPCIONAL)
            
        }
    }
}
