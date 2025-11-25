import Objectes.Botella;
import Objectes.Vaso;
public class TeoriaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Botella bottle;
        bottle = new Botella();
        System.out.println("capacida botella " + bottle.getCapacidad());
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("tapon " + bottle.estaCerrada());
        
        System.out.println("Abro bottella");
        bottle.abrir();
        System.out.println("Intento poner 70");
        bottle.setLiquido(70);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        
        System.out.println("Intento poner 10");
        bottle.setLiquido(10);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Intento poner 5");
        bottle.setLiquido(5);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("relleno con 5");
        bottle.rellenar(5);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        
        Vaso glass1 = new Vaso();
        Vaso glass2 = new Vaso(4);
        Vaso glass3 = new Vaso();
        Vaso glass4 = new Vaso();
        System.out.println("Llena la botella");
        bottle.rellenar(25);

        System.out.println("Empiezo a llenar vaosos con la botella" + bottle.getMlLiquido());
        while (!bottle.isVacia()) {
            //Cambiar o añadir metodos a baso y botella
            //para el liquido sobrnate al rellanar vuelva la botella
            //if (glass1.getMlLiquido()!=glass1.getCapacidad()) {
            if (!glass1.isLleno()) {
                System.out.println("Rellenando vaso 1");
                glass1.rellenar(bottle.verter());
                System.out.println("A la botella le queda " + bottle.getMlLiquido());
            }else if (!glass2.isLleno()) {
                System.out.println("Rellenando vaso 2");
                glass2.rellenar(bottle.verter());
                System.out.println("A la botella le queda " + bottle.getMlLiquido());

            }else if (!glass3.isLleno()) {
                System.out.println("Rellenando vaso 3");
                glass3.rellenar(bottle.verter());
                System.out.println("A la botella le queda " + bottle.getMlLiquido());
            }else if (!glass4.isLleno()) {
                System.out.println("Rellenando vaso 4");
                glass4.rellenar(bottle.verter());
                System.out.println("A la botella le queda " + bottle.getMlLiquido());
            }
        }
    }
}