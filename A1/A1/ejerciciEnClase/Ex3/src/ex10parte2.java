import java.util.Scanner;

public class ex10parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Programa que calcula el salari net mensual d'un treballador
         en funció del nombre d'hores treballades i la taxa d'impostos d'acord 
         amb les hipòtesis següents:
        Les primeres 130 hores es paguen a tarifa normal (15,00 €/h).
        Les hores que passin de 130 es paguen a 1,5 vegades la tarifa normal.
        Les taxes d'impostos són:
        Els 1000 primers euros són lliures d'impostos.
        Els 400 següents tenen un 25% d'impostos.
        La resta un 45% d'impostos. Escriure nom, salari brut, taxes i salari net.
        */
        //Pedir horas trabajadas
        System.out.print("Introdueix el nombre d'hores treballades al mes: ");
        int horesTreballades = sc.nextInt();
        final int TARIFA = 15; //€/h
        final double EXTRA = 1.5; //1.5 vegades la tarifa normal
        int hora;
        double salariBrut; //Salari abans d'impostos
        //Calcular salari brut
        if (horesTreballades >= 130) {  
            salariBrut = horesTreballades * TARIFA;
            System.out.println("El salari brut és: " + salariBrut + " euros");
        } else {
            double horesExtra = horesTreballades - 130; 
            salariBrut = (130 * TARIFA) + (horesExtra * TARIFA * 1.5);
        }
        //mostrar salari brut
        System.out.println("El salari brut és: " + salariBrut + " euros");
        
    }
}
