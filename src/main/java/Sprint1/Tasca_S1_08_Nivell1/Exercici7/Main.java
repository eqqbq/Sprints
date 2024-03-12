package Sprint1.Tasca_S1_08_Nivell1.Exercici7;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.CharSequence.compare;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Buenos días");
        listaCadenas.add("Color");
        listaCadenas.add("El cielo es azul");
        listaCadenas.add("Ordenador");
        listaCadenas.add("Sol");

        listaCadenas.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        listaCadenas.forEach(System.out::println);
    }
}
