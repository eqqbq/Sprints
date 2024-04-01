package Sprint1.Tasca_S1_01_Nivell1.exercici2;

public class main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(12);

        System.out.println(coche1.toString());
        System.out.println(coche1.accelerar());
        System.out.println(Coche.frenar());
    }
}