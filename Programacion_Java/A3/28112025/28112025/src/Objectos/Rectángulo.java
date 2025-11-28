package Objectos;

public class Rectángulo {  
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Rectángulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    //Método para imprimir la información del rectángulo por pantalla.
    public void imprimirInfo() {
        System.out.println("Rectángulo: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
    }

    //Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(…).
    public void setX1Y1(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    //Métodos getPerimetro y getArea que calculen y devuelvan el paerímetro y área del objeto.
    // Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
    public double getPerimetro() {
        return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }

}
