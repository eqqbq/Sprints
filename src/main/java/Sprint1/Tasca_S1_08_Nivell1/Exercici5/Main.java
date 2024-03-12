package Sprint1.Tasca_S1_08_Nivell1.Exercici5;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface valorDePi = () -> 3.1415;
        double valorPi = valorDePi.getPiValue();

        System.out.println(valorPi);
    }
}
