package Sprint1.Tasca_S1_01_Nivell1.exercici1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Instruments.ejemploStatic();

        ArrayList<Instruments> listaInstruments = new ArrayList<>();

        Instruments instrument1 = new Vent("Flauta", 20);
        Instruments instrument2 = new Percussio("Bateria", 40);
        Instruments instrument3 = new Corda("Guitarra", 50);
        Instruments instrument4 = new Vent("", 0);
        Instruments instrument5 = new Percussio("", 0);
        Instruments instrument6 = new Corda("", 0);

        listaInstruments.add(instrument1);
        listaInstruments.add(instrument2);
        listaInstruments.add(instrument3);
        listaInstruments.add(instrument4);
        listaInstruments.add(instrument5);
        listaInstruments.add(instrument6);

        instrument4.setNom("Flauta2");
        instrument4.setPreu(40);
        instrument5.setNom("Bateria2");
        instrument5.setPreu(70);
        instrument6.setNom("Guitarra2");
        instrument6.setPreu(80);

        System.out.println(instrument1.getNom() + " " + instrument1.getPreu());
        System.out.println(instrument1.tocar());

        System.out.println(instrument2.getNom() + " " + instrument2.getPreu());
        System.out.println(instrument2.tocar());

        System.out.println(instrument3.getNom() + " " + instrument3.getPreu());
        System.out.println(instrument3.tocar());

        System.out.println(instrument4.getNom() + " " + instrument4.getPreu());
        System.out.println(instrument4.tocar());

        System.out.println(instrument5.getNom() + " " + instrument5.getPreu());
        System.out.println(instrument5.tocar());

        System.out.println(instrument6.getNom() + " " + instrument6.getPreu());
        System.out.println(instrument6.tocar());

    }
}