package Sprint1.Tasca_S1_08_Nivell1.Exercici8;

public class Main {
    public static void main(String[] args) {

        String palabra = "Extremoduro";
        String palabra2 = "";

        FunctionalInterface functionalInterface = (x -> new StringBuilder(x).reverse().toString());

        palabra2 = functionalInterface.reverse(palabra);

        System.out.println(palabra);
        System.out.println(palabra2);
    }
}
