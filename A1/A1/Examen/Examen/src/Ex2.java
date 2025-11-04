import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int minim, maxim, suma_acum=0, cont_voltes=0;
        System.out.println("Introduceti minim:");
        minim = scanner.nextInt();
        System.out.println("Introduceti maxim:");
        maxim = scanner.nextInt();
        
        
        for (int i = minim; i <= maxim; i++) {
            suma_acum += i;
            cont_voltes++;
        }
        System.out.println("El numero entre " + minim + " i " + maxim + " son: " + cont_voltes);
        System.out.println("la suma es = " + suma_acum);
    }
}
