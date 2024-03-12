package Sprint1.Tasca_S1_08_Nivell2.Exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaRandom = new ArrayList<>();

        listaRandom.add("ewewrw");
        listaRandom.add("4648684");
        listaRandom.add("Asteroide");
        listaRandom.add("qpowkepoqwke");
        listaRandom.add("easdasd");
        listaRandom.add("120938120983");
        listaRandom.add("403223094");
        listaRandom.add("asdasdsad");
        listaRandom.add("etyweytweytewyte");
        listaRandom.add("aaaaaaaaaa");

        ordenarAlfabeticamente(listaRandom);
        empiezanPorE(listaRandom);
        remplazarAPor4(listaRandom);
        imprimirCadenaNumeros(listaRandom);
    }

    public static void ordenarAlfabeticamente(List<String> listaRandom){

        System.out.println("Lista ordenada alfabéticamente: " + "\n");

        List<String> ordenadaAlfabeticamente;

        ordenadaAlfabeticamente = listaRandom.stream()
                .sorted(Comparator.comparingInt(x -> x.charAt(0)))
                .toList();

        ordenadaAlfabeticamente.forEach(System.out::println);
        System.out.println("---------------------------");

    }

    public static void empiezanPorE(List<String> listaRandom){

        System.out.println("Lista filtrada empiezan por 'E' primero: " + "\n");

        listaRandom.stream().filter((x -> x.startsWith("e"))).forEach(System.out::println);
        listaRandom.stream().filter((x -> !x.startsWith("e"))).forEach(System.out::println);
        System.out.println("---------------------------");
    }

    public static void remplazarAPor4(List<String> listaRandom){

        System.out.println("Lista remplazando las 'A' por '4': " + "\n");

        listaRandom.forEach(x -> System.out.println(x.replace('a', '4')));
        System.out.println("---------------------------");
    }

    public static void imprimirCadenaNumeros(List<String> listaRandom){

        System.out.println("Sólo se imprimen las cadenas de números:" + "\n");

        listaRandom.forEach(x -> {
            if (x.matches("-?[1-9][0-9]*")) {
                System.out.println(x);
            }
        });

        System.out.println("---------------------------");
    }
}