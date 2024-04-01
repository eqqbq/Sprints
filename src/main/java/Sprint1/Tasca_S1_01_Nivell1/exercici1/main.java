package Sprint1.Tasca_S1_01_Nivell1.exercici1;

import Sprint1.Tasca_S1_06_Nivell1.Exercici2.Persona;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ejemploStatic();

        Vent instrument1 = new Vent("Flauta", 20);
        Percussio instrument2 = new Percussio("Bateria", 40);
        Corda instrument3 = new Corda("Guitarra", 50);
        Vent instrument4 = new Vent("", 0);
        Percussio instrument5 = new Percussio("", 0);
        Corda instrument6 = new Corda("", 0);

        instrument4.setNom("Flauta2");
        instrument4.setPreu(40);
        instrument5.setNom("Bateria2");
        instrument5.setPreu(70);
        instrument6.setNom("Guitarra2");
        instrument6.setPreu(80);

        System.out.println(instrument1);
        System.out.println(instrument1.tocar());

        System.out.println(instrument2);
        System.out.println(instrument2.tocar());

        System.out.println(instrument3);
        System.out.println(instrument3.tocar());

        System.out.println(instrument4);
        System.out.println(instrument4.tocar());

        System.out.println(instrument5);
        System.out.println(instrument5.tocar());

        System.out.println(instrument6);
        System.out.println(instrument6.tocar());

    }

    public static void ejemploStatic(){
        System.out.println("Ejemplo static method.");
    }
}