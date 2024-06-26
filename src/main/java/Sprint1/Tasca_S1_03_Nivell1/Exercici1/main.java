package Sprint1.Tasca_S1_03_Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        ArrayList<Month> calendari = new ArrayList<Month>();
        calendari.add(new Month("Gener"));
        calendari.add(new Month("Febrer"));
        calendari.add(new Month("Març"));
        calendari.add(new Month("Abril"));
        calendari.add(new Month("Maig"));
        calendari.add(new Month("Juny"));
        calendari.add(new Month("Juliol"));
        calendari.add(new Month("Septembre"));
        calendari.add(new Month("Octubre"));
        calendari.add(new Month("Novembre"));
        calendari.add(new Month("Decembre"));

        Month agost = new Month("Agost");
        calendari.add(7, agost);

        System.out.println("La Arraylist manté el ordre desprès d'afegir 'Agost' a la posició corresponent:");
        calendari.forEach(System.out::println);

        System.out.println();

        HashSet<Month> hashSetCalendari = new HashSet<>(calendari);
        hashSetCalendari.add(agost);

        System.out.println("Mostra de que HashSet no permet duplicats: (Iterat amb un for each.) ");

        for (Month month : hashSetCalendari) System.out.println(month);
        System.out.println();

        System.out.println("Mostra de que HashSet no permet duplicats: (Iterat amb un iterador.) ");
        Iterator<Month> it = hashSetCalendari.iterator();

        while( it.hasNext()){
            System.out.println(it.next());
        }
    }
}
