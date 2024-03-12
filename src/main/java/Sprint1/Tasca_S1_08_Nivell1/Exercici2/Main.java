package Sprint1.Tasca_S1_08_Nivell1.Exercici2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> llistaStrings = new ArrayList<>();

        llistaStrings.add("Hola");
        llistaStrings.add("Gener");
        llistaStrings.add("Días");
        llistaStrings.add("Buenos");
        llistaStrings.add("Ordenador");
        llistaStrings.add("Programación");
        llistaStrings.add("Centro");
        llistaStrings.add("Camiseta");

        filtros(llistaStrings);
    }

    public static void filtros(ArrayList<String> llistaStrings){

        llistaStrings.stream()
                .filter (x -> x.contains("o"))
                .filter (x -> x.length() > 5)
                .forEach(x -> System.out.print(x + " " + "\n"));
    }
}
