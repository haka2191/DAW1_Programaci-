public class pedirDatosEntreIntervalo {

    public static int pedirDatosEntreIntervalo(int min, int max){
        int valor;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cambio;
        if (min > max){
            cambio = min;
            min = max;
            max = cambio;
            
        }
        do {
            System.out.print("Pon un valor entre" + min + " i " + max + ": ");
            valor = sc.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }
}
