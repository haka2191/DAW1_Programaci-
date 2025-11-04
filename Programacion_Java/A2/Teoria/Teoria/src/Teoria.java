import java.util.Scanner;

public class Teoria {
    public static void main(String[] args) throws Exception {
        
        //holaMundo();
        for(int i=0; i<5; i++){ //5 veces
            holaMundo();
        }

        //triple(5);//no fa res
        //opcio 1: mostrar directament
        //int calculo = triple(5); //15
        //System.out.println("El triple de 5 es : " + calculo);

        //opcio 2: en un bucle
        int calculo;
        //En for
        for(int i=1; i<=10; i++){
            calculo = triple(i);
            System.out.println("El triple de " + i + " es : " + calculo);
        }
        
        //opcio 3: perguntar a l'usuari el numero a calcular
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Introdueix un numero per trobar el seu triple: ");
        //int numero = scanner.nextInt();
        int numero = pideNumeroUsuario();
        calculo = triple(numero);
        System.out.println("El triple de " + numero + " es : " + calculo);
        
    }
    /**
     * Imprimeix Hola Mundo per pantalla
     */
    public static void holaMundo(){
        //Mostrar resultats 
        //mostrar la part d'un programa
        System.out.println("Hola Mundo");
    }

    /**
     * Retorna el triple d'un numero
     * @param numero numero que quiere encontrar el triple
     * @return el triple del numero de entrada
     */
    public static int triple(int numero)
    {//retornne coses normalment no tindran souts
        int resultat = numero * 3;
        return resultat;
        //return (numero * 3); //una sola linia
    }

    /**
     * pide un numero a l'usuari i el retorna
     * @return
     */
    public static int pideNumeroUsuario(){
        Scanner scanner = new Scanner(System.in);
        int numero;
        do{
        System.out.println("Introdueix un numero per trobar el seu triple: ");
        numero = scanner.nextInt();
        }while(numero <= 0);
        return numero;
        
    }
}
