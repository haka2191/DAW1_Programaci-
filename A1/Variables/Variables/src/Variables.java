import java.util.Scanner;

public class Variables {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int suma;
        //int a=5, b=19, c=8;
        int a , b , c;
        System.out.println("Primera nota = ");
        a = sc.nextInt();
        System.out.println("Segona nota = ");
        b = sc.nextInt();
        System.out.println("Tercero nota = ");
        c = sc.nextInt();
        suma= a + b + c;
        int media = suma/3;
        System.out.println("El suma total es " + media);

/*      int nota;
        nota=2;
        double precio = 4.75, precio2=4.6, precio3=10;
        char letra = 'c';
        boolean Hola = true;
        System.out.println("El precio es " +precio);
        System.out.println("La nota es " + nota);
        System.out.println("Has certado la palabra " + Hola);
        System.out.println("Has apretado la letra " + letra);
        precio = precio2 + precio3;
        System.out.println("El nuevo precio " + precio);*/
    }
}
