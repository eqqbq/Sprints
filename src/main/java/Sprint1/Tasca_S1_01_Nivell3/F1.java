package Sprint1.Tasca_S1_01_Nivell3;

import java.util.Scanner;

public class F1 extends Noticia {

    private String escuderia;
    private final int PREU_INICIAL = 100;
    private final int PUNTS_INICIAL = 4;

    public F1(String titular, Redactor redactor, String escuderia) {
        super(titular, redactor);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public static F1 noticiaF1(Redactor redactor, String titular){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu la escuderia a la que fa referència la noticia: ");
        String escuderia = sc.nextLine();

        return new F1(titular, redactor, escuderia);
    }

    @Override
    public void calcularPreuNoticia() {
        int preuFinal = 0;

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            preuFinal += 50;
        }
        preuFinal = preuFinal + PREU_INICIAL;

        System.out.println("El preu total de la noticia és de: " + preuFinal + " euros.");
    }

    @Override
    public void calcularPunts() {
        int totalPunts = 0;

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            totalPunts += 2;
        }
        totalPunts = totalPunts + PUNTS_INICIAL;

        System.out.println("El total de punts de la noticia és de: " + totalPunts);
    }
}
