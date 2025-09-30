public class ex12Switch {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Demanar el color del semàfor
        System.out.print("De quin color està el semàfor? (V=Verd / T=Taronja / R=Roig): ");
        char resposta = sc.nextLine().toUpperCase().charAt(0);

        // Decidir acció segons la resposta utilitzant switch
        //sustuituir if (cond == con1)
        switch (resposta) {
            case 'v': //como no hay break ejecuta las lineas de abajo
            case 'V':
                System.out.println("Pots passar.");
                break;
            case 't': //como no hay break ejecuta las lineas de abajo
            case 'T':
                System.out.println("Millor espera.");
                break;
            case 'r': //como no hay break ejecuta las lineas de abajo
            case 'R':
                System.out.println("Atura't!");
                break;
            default:
                System.out.println("Color no vàlid. Introdueix V, T o R.");
                break;
        }
    }
}
