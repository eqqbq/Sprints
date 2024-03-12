package Sprint1.Tasca_S1_08_Nivell1.Exercici6;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Buenos días");
        listaCadenas.add("Color");
        listaCadenas.add("El cielo es azul");
        listaCadenas.add("Ordenador");
        listaCadenas.add("Sol");

        listaCadenas.sort(Comparator.comparingInt(String::length));
        listaCadenas.forEach(System.out::println);
    }
}
