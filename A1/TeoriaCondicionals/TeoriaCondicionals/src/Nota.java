import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        double nota;
        final int APROBADO= 5;
        System.out.println("Pedir la nota? ");
        nota = sc.nextInt();
        /*if (nota>=5)
        //if (nota>= APROBADO 5-10)
        {
            System.out.println("Has provat. Felicitats!!!");
        }
        else
        {
            System.out.println("Has supendido.");
        }*/
        if (nota<APROBADO) 
        {
            System.out.println("Has suspes.");
        }else if (nota>=APROBADO && nota<7) 
        {
            System.out.println("Has provat. Felicitats");    
        }else if (nota>=7 && nota<9) 
        {
            System.out.println("Has sacado un notable");    
        }else if (nota>=9 && nota<=10)
        {
            System.out.println("Has sacado un excelente");
        }
    }
}
