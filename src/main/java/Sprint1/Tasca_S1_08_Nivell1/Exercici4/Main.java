package Sprint1.Tasca_S1_08_Nivell1.Exercici4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> mesosAny = new ArrayList<>();

        mesosAny.add("Gener");
        mesosAny.add("Febrer");
        mesosAny.add("Març");
        mesosAny.add("Abril");
        mesosAny.add("Maig");
        mesosAny.add("Juny");
        mesosAny.add("Juliol");
        mesosAny.add("Agost");
        mesosAny.add("Septembre");
        mesosAny.add("Octubre");
        mesosAny.add("Novembre");
        mesosAny.add("Decembre");

        mesosAny.forEach(System.out::println);
    }
}
