package Sprint1.Tasca_S1_08_Nivell1.Exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> llistaStrings = new ArrayList<>();

        llistaStrings.add("Hola");
        llistaStrings.add("Gener");
        llistaStrings.add("Días");
        llistaStrings.add("Buenos");
        llistaStrings.add("Febrer");

        contieneLetraO(llistaStrings);
    }

    public static void contieneLetraO(ArrayList<String> llistaStrings){

        llistaStrings.stream()
                .filter (x -> x.contains("o"))
                .forEach(x -> System.out.print(x + " " + "\n"));

    }
}
