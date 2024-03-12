package Sprint1.Tasca_S1_08_Nivell2.Exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaCadenas = new ArrayList();

        listaCadenas.add("Buenos");
        listaCadenas.add("Tardes");
        listaCadenas.add("Cielo");
        listaCadenas.add("Apu");
        listaCadenas.add("Art");
        listaCadenas.add("Planta");
        listaCadenas.add("Arm");

        List<String> empiezanAcon3letras;

        empiezanAcon3letras = listaCadenas.stream()
                .filter (palabraFiltrada -> palabraFiltrada.startsWith("A") && palabraFiltrada.length() == 3)
                .toList();

        empiezanAcon3letras.forEach(System.out::println);

    }
}
