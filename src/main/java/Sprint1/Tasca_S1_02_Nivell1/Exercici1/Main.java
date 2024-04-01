package Sprint1.Tasca_S1_02_Nivell1.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producte> collecioProductes1 = new ArrayList<Producte>();
        ArrayList<Producte> collecioProductes2 = new ArrayList<Producte>();
        int[] arrayOOB = {2, 3, 4};
        Producte producte1 = new Producte("patata", 2);
        Producte producte2 = new Producte("manzana", 3);
        Producte producte3 = new Producte("zanahoria", 4);

        collecioProductes1.add(producte1);
        collecioProductes1.add(producte2);
        collecioProductes1.add(producte3);

        Venda venda1 = new Venda(collecioProductes1, 0);
        Venda venda2 = new Venda(collecioProductes2, 0);

        try{
            venda1.calcularTotal();
        } catch (VendaBuidaException e){
            System.out.println(e);
        }

        try {
            venda2.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e);
        }

        System.out.println(venda1.getPreuVenta());
        System.out.println(venda2.getPreuVenta());


        try {
            arrayOOB[9] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
