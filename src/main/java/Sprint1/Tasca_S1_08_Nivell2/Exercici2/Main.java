package Sprint1.Tasca_S1_08_Nivell2.Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(91);
        listaNumeros.add(37);
        listaNumeros.add(98);
        listaNumeros.add(53);
        listaNumeros.add(42);

        String parImpar = listaNumeros.stream()
                .map(i -> (i % 2 == 0 ? "e" : "o") + i)
                .collect(Collectors.joining(", "));

        System.out.println(parImpar);
    }
}
