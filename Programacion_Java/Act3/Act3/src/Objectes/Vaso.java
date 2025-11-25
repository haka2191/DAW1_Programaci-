package Objectes;
public class Vaso {
    //private /public
    private int ml_liquido;    
    private int ml_capacidad;
    private String material; 
//    int cm_alto;
//    double base;
    public Vaso()
    {
        ml_capacidad = 8;
        ml_liquido = 0;
        material = "Plástico";
    }

    public Vaso(int capacidadVaso){
        ml_capacidad = capacidadVaso;
        ml_liquido = 0;
        material = "Plástico";
    }

    public Vaso(String material){
        this.ml_capacidad = 6;
        this.ml_liquido = 0;
        this.material = material;//this hace referencia al atributo del objeto
    }

     public int getMlLiquido()
    {
        return ml_liquido;
    }

    public int getCapacidad()
    {
        return ml_capacidad;
    }

     public String getMaterial()
    {
        return material;
    }

    public void rellenar (int nuevo_ml)
    {
        if (nuevo_ml < 0) {
            System.out.println("No puedo añadir.");
        }
        else if ((ml_liquido + nuevo_ml) > ml_capacidad) {
            System.out.println("Sobran ml " + (ml_capacidad - ml_liquido - nuevo_ml));
            ml_liquido = ml_capacidad;
        }
        else
        {
            ml_liquido += nuevo_ml;
        }
    }

    public int verter()
    {
        int LiquidoVertido = 8;

        if (ml_liquido > LiquidoVertido) {
            ml_liquido = ml_liquido - 2;
            return ml_liquido;
        }

        if (ml_liquido == LiquidoVertido) {
            ml_liquido = ml_liquido - LiquidoVertido;
        } return ml_liquido;
    } 
    /**
     * Metodo que me indica si el vaso esta lleno
     * devuele true si esta lleno o false si no 
     */

    public boolean isLleno(){
        return ml_liquido == ml_capacidad;
        /*if (ml_liquido == ml_capacidad){
            return true;
        } else {
            return false; 
        }*/
    }
}
