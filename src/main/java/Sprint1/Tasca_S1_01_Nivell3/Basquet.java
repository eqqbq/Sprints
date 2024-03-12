package Sprint1.Tasca_S1_01_Nivell3;

import java.util.Scanner;

public class Basquet extends Noticia {
    private String competicio;
    private String club;
    private final int PREU_INICIAL = 250;
    private final int PUNTS_INICIAL = 4;

    public Basquet(String titular, Redactor redactor, String competicio, String club) {
        super(titular, redactor);
        this.competicio = competicio;
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public static Basquet noticiaBasquet(Redactor redactor, String titular){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu la competició a la que fa referència la notícia: ");
        String competicio = sc.nextLine();

        System.out.println("Escriu el club al que fa referència la notícia: ");
        String club = sc.nextLine();

        return new Basquet(titular,redactor,competicio, club);
    }

    @Override
    public void calcularPreuNoticia() {
        int preuFinal = 0;

        if (competicio.equalsIgnoreCase("eurolliga")) {
            preuFinal += 75;
        }
        if (club.equalsIgnoreCase("Madrid") || club.equalsIgnoreCase("Barça")) {
            preuFinal += 75;
        }
        preuFinal = preuFinal + PREU_INICIAL;

        System.out.println("El preu total de la noticia es de: " + preuFinal + " euros.");
    }

    @Override
    public void calcularPunts() {
        int totalPunts = 0;

        if (competicio.equalsIgnoreCase("eurolliga")) {
            totalPunts += 3;

        } else if (competicio.equalsIgnoreCase("acb")) {
            totalPunts += 2;
        }
        if (club.equalsIgnoreCase("Madrid") || club.equalsIgnoreCase("Barça")) {
            totalPunts += 1;
        }
        totalPunts = totalPunts + PUNTS_INICIAL;

        System.out.println("El total de punts de la noticia és de: " + totalPunts);
    }
}
