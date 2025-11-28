package PruebaPuntos;
import Objectes.*;

public class PruebaPuntos {
    public static void main(String[] args) throws Exception {
        Punto1 p1 = new Punto1(5, 0);
        Punto1 p2 = new Punto1(10, 10);
        Punto1 p3 = new Punto1(-3, 7);
        //p1.x = 5; sin el constructor
        //p1.y = 0;
        //System.out.println("Punto 1: " + p1.x + ", " + p1.y); Sin los getters y setters
        //System.out.println("Punto 2: " + p2.x + ", " + p2.y);
        //System.out.println("Punto 2: " + p3.x + ", " + p3.y);
        System.out.println("Punto 1: " + p1.getX() + ", " + p1.getY()); //Con los getters y setters 
        System.out.println("Punto 2: " + p2.getX() + ", " + p2.getY());
        System.out.println("Punto 3: " + p3.getX() + ", " + p3.getY());
        p1.setX(15);//con los setters y getters
        p1.setY(20);
        System.out.println("Punto 1 modificado: " + p1.getX() + ", " + p1.getY());

        p1.imprime();//llama al metodo imprime
        p2.imprime();
        p3.imprime();
        p1.setXY(7, -5);//llama al metodo setXY
        p1.imprime();
        p2.desplaza(2, 5);//llama al metodo desplaza
        p2.imprime();
        p3.desplaza(-1, -3);
        p3.imprime();
        p1.resto(p2);//llama al metodo resto
        p1.imprime();
    }
}
