import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter_deposito;
        final int DEPOSITO_LLENO= 100;
        int litros_deposito, deposito_percentaje, litros_viaje;
        
        System.out.println("Que caracter quieres para mostrar el deposito?");
        caracter_deposito = scanner.next().charAt(0);

        litros_deposito = DEPOSITO_LLENO;
        
        do{
        System.out.print("[");
        for(int i=1; i < (litros_deposito/4); i++){
            System.out.print(caracter_deposito);
        }
        System.out.println("]" + " " + litros_deposito + "L");

        System.out.println("Cuantos litros has gastado en el viaje?");
        litros_viaje = scanner.nextInt();
        litros_deposito -= litros_viaje;
    }    while(litros_deposito > 0);
    System.out.println("Fin de deposito");
    }
}
