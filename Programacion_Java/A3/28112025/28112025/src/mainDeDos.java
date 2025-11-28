import Objectos.Artículo;
import Objectos.Rectángulo;
public class mainDeDos {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------");
        System.out.println("Pruebas con la clase Rectángulo:");
        Rectángulo rect1 = new Rectángulo(10, 20, 30,40);
        //rect1.x1 = 10; // sin constructor
        //rect1.y1 = 20;
        //rect1.x2 = 30;
        //rect1.y2 = 40;
        System.out.println("Rectángulo 1: (" + rect1.x1 + ", " + rect1.y1 + "), (" + rect1.x2 + ", " + rect1.y2 + ")");
        // Usando getters
        System.out.println("Rectángulo 1 modificado: (" + rect1.getX1() + ", " + rect1.getY1() + "), (" + rect1.getX2() + ", " + rect1.getY2() + ")"); 
        // Usando setters
        rect1.setX1(15);
        rect1.setY1(25);
        rect1.setX2(35);
        rect1.setY2(45);
        System.out.println("Rectángulo 1 después de usar setters: (" + rect1.getX1() + ", " + rect1.getY1() + "), (" + rect1.getX2() + ", " + rect1.getY2() + ")");

        // Imprimir información del rectángulo
        rect1.imprimirInfo();

        // Usando setX1Y1
        rect1.setX1Y1(20, 30);
        System.out.println("Rectángulo 1 después de setX1Y1: (" + rect1.getX1() + ", " + rect1.getY1() + "), (" + rect1.getX2() + ", " + rect1.getY2() + ")");
        // Calcular perímetro
        double perimetro = rect1.getPerimetro();
        System.out.println("Perímetro del Rectángulo 1: " + perimetro);

        System.out.println("-------------------");
        System.out.println("Pruebas con la clase Artículo:");
        Artículo articulo1 = new Artículo("Libro", 29.99, 0.21, 100);
        //articulo1.nombre = "Libro";
        //articulo1.precio = 29.99;
        //articulo1.cuantosQuedan = 100;
        //System.out.println("Artículo: " + articulo1.nombre);
        //System.out.println("Precio: " + articulo1.precio);
        //System.out.println("IVA: " + articulo1.iva);
        //System.out.println("Cuántos quedan: " + articulo1.cuantosQuedan);
        System.out.println("Artículo: " + articulo1.nombre + ", Precio: " + articulo1.precio + ", IVA: " + articulo1.iva + ", Cuántos quedan: " + articulo1.cuantosQuedan);

        // Usando getters
        System.out.println("Artículo (usando getters): " + articulo1.getNombre() + ", Precio: " + articulo1.getPrecio() + ", IVA: " + articulo1.getIva() + ", Cuántos quedan: " + articulo1.getCuantosQuedan());
        // Usando setters
        articulo1.setNombre("Cuaderno");
        articulo1.setPrecio(3.49);
        articulo1.setIva(0.21);
        articulo1.setCuantosQuedan(200);
        System.out.println("Artículo después de usar setters: " + articulo1.getNombre() + ", Precio: " + articulo1.getPrecio() + ", IVA: " + articulo1.getIva() + ", Cuántos quedan: " + articulo1.getCuantosQuedan()); 

        //imprimir información del artículo
        articulo1.imprimirInfo();

        // Calcular PVP
        double pvp = articulo1.getPVP();
        System.out.println("PVP del Artículo 1: " + pvp);
        // Calcular PVP con descuento
        double pvpDescuento = articulo1.getPVPDescuento(0.10); // 10% de descuento
        System.out.println("PVP del Artículo 1 con 10% de descuento: " + pvpDescuento);
        

    }
}
