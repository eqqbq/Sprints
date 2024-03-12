package Sprint1.Tasca_S1_03_Nivell1.Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<>();
        List<Integer> llistaReves = new ArrayList<>();

        llista.add(3);
        llista.add(4);
        llista.add(5);

        ListIterator<Integer> listIterator = llista.listIterator();

        while (listIterator.hasNext()){
            listIterator.next();
        }

        while(listIterator.hasPrevious()){
            llistaReves.add(listIterator.previous());
        }

        for (Integer num : llistaReves){
            System.out.println(num);
        }

    }
}
