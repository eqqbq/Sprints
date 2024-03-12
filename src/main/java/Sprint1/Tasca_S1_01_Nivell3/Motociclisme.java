package Sprint1.Tasca_S1_01_Nivell3;

import java.util.Scanner;

public class Motociclisme extends Noticia {

    private String equip;
    private final int PREU_INICIAL = 100;
    private final int PUNTS_INICIAL = 3;

    public Motociclisme(String titular, Redactor redactor, String equip) {
        super(titular,redactor);
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public static Motociclisme noticiaMotociclisme(Redactor redactor, String titular){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu a quin equip fa referència la notícia: ");
        String equip = sc.nextLine();

        return new Motociclisme(titular,redactor,equip);
    }

    @Override
    public void calcularPreuNoticia() {
        int preuFinal = 0;

        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            preuFinal += 50;
        }
        preuFinal = preuFinal + PREU_INICIAL;

        System.out.println("El preu total de la noticia és de: " + preuFinal + " euros.");
    }

    @Override
    public void calcularPunts() {
        int totalPunts = 0;

        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
            totalPunts += 3;
        }
        totalPunts = totalPunts + PUNTS_INICIAL;

        System.out.println("El total de punts de la noticia és de: " + totalPunts);
    }
}
