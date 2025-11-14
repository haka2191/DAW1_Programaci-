public class Llibreries {
    public static void main(String[] args) {
        //Llibreria Math
        double numeroPi= Math.PI;
        double calculo = numeroPi * 2;
        System.out.println(numeroPi + " - " + calculo);
        double numero = -7;
        double numero_absoluto = Math.abs(numero);
        System.out.println(numero_absoluto);

        /**
         * Devuelve el menor valor de tipo double (más cercano a infinito negativo) 
         * que sea mayor o igual que el argumento y sea igual a un entero.
         */
        double redondeo = Math.ceil(9.2); //arrodonir cap amunt
        System.out.println(redondeo);

        /**
         * Devuelve el mayor valor de tipo double (más cercano a infinito positivo)
         * que sea menor o igual que el argumento y sea igual a un entero.
         */
        double redondeo2 = Math.floor(9.6); 
        System.out.println(redondeo2);
    }
}
