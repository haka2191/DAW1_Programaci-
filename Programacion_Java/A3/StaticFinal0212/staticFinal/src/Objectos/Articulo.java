package Objectos;
public class Articulo {
    public String nombre;
    public double precio;
    public static double iva=0.21;
    public int cuantosQuedan;

    //Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y cuantosQuedan. 
    // Dicho constructor deberá mostrar un mensaje de error si alguno de los valores nombre, precio, iva o 
    // cuantosQuedan no son válidos. ¿Qué coindiciones crees que podrían determinar si son válidos o no? 
    // Razónalo e implementa el código. Corrige el main y prueba a crear varios artículos. 
    // Introduce algunos con valores incorrectos para comprobar si avisa del error.
    
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        boolean error = false;
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: Nombre no válido.");
            error = true;
        }
        if (precio < 0) {
            System.out.println("Error: Precio no válido.");
            error = true;
        }
        if (cuantosQuedan < 0) {
            System.out.println("Error: Cantidad no válida.");
            error = true;
        }
        if (!error) {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
        }else{
            this.nombre = "";
        }
    }
    
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        boolean error = false;
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: Nombre no válido.");
            error = true;
        }
        if (precio < 0) {
            System.out.println("Error: Precio no válido.");
            error = true;
        }
        if (iva < 0 || iva > 1) {
            System.out.println("Error: IVA no válido.");
            error = true;
        }
        if (cuantosQuedan < 0) {
            System.out.println("Error: Cantidad no válida.");
            error = true;
        }
        if (!error) {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }else{
            this.nombre = "";
        }
    }
        public String getNombre() {
            return nombre;
        }
        public double getPrecio() {
            return precio;
        }
        public double getIva() {
            return iva;
        }
        public int getCuantosQuedan() {
            return cuantosQuedan;
        }
        public void setNombre(String nombre) {
            if (nombre == null || nombre.isEmpty()) {
            System.out.println("Error: Nombre no válido.");
        }else{
            this.nombre = nombre;
        }
    }
        public void setPrecio(double precio) {
            if (precio < 0) {
            System.out.println("Error: Precio no válido.");
        }else{
            this.precio = precio;
        }
        }
        public void setIva(double iva) {
            if (iva < 0 || iva > 1) {
            System.out.println("Error: IVA no válido.");
        }else{
               this.iva = iva;
        }
    }
        public void setCuantosQuedan(int cuantosQuedan) {
            if (cuantosQuedan < 0) {
            System.out.println("Error: Cantidad no válida.");
        }else{
            this.cuantosQuedan = cuantosQuedan;
        }
        }
        // Método para imprimir la información del artículo por pantalla.
        public void imprimirInfo() {
            System.out.println("Artículo: " + nombre + ", Precio: " + precio + ", IVA: " + iva + ", Cuántos quedan: " + cuantosQuedan);
        }

        //Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
        public double getPVP() {
            return precio * (1 + iva);
        }

        //Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
        public double getPVPDescuento(double descuento) {
            double pvp = getPVP();
            return pvp * (1 - descuento);
        }

        public boolean vender(int ventas) {
            if (ventas > cuantosQuedan) {
                System.out.println("No puedo vender " + ventas + " me queda " + cuantosQuedan);
                return false;
            } else {
                cuantosQuedan -= ventas;
                return true;
            }
        }

        public boolean almacenar(int almacen) {
            if (almacen < 0) {
                System.out.println("No se puede almacenar una cantidad negativa: " + almacen);
                return false;
            } else {
                cuantosQuedan += almacen;
                return true;
            }
        }


}
