import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pide numero hasta que no poner un 0 "para salir"
        int numero;
        int suma = 0;
        do {
            System.out.print("Poner un numero (0 para salir): ");
            numero = sc.nextInt();
            //System.out.println("Numero: " + numero);
        } while (numero != 0); 
        System.out.println("Has salido del programa.");

        
        
        
        
        //Suma de los numeros introducidos
        System.out.println("====Con SUMA ========");
        do {
            System.out.print("Poner un numero (0 para salir): ");
            numero = sc.nextInt();
            suma= suma + numero;
            System.out.println(" Suma de los numeros -----> " + suma);
            //System.out.println("Numero: " + numero);
        } while (numero != 0); 
        System.out.println("Has salido del programa.");

        
        
        
        //-1 para salir pero no se suma los otros numeros ejemplo -3,-2... tiene que restar
        System.out.println("====Con SUMA -1 para salir ========");
        suma = 0; //reiniciamos la suma
        do {
            System.out.print("Poner un numero (-1 para salir): ");
            numero = sc.nextInt();
            if (numero != -1) { //si no es -1 se suma
                suma= suma + numero;
            }
            System.out.println(" Suma de los numeros -----> " + suma);
            //System.out.println("Numero: " + numero);
        } while (numero != -1);
        System.out.println("Has salido del programa.");


        
        //Otra opciona para salir boolean
        System.out.println("====Con SUMA -1 para salir con boolean ========");
        suma = 0; //reiniciamos la suma
        boolean salir = false;
        do {
            System.out.print("Poner un numero (-1 para salir): ");
            numero = sc.nextInt();
            if (numero == -1) { //si es -1 se sale
                salir = true;
            } else { //si no es -1 se suma
                suma= suma + numero;
            }
            System.out.println(" Suma de los numeros -----> " + suma);
            //System.out.println("Numero: " + numero);
        } while (!salir);
        //while (salir == false); otra forma de ponerlo 
        System.out.println("Has salido del programa.");
        sc.close();
    }
}
