package Sprint1.Tasca_S1_01_Nivell3;

import java.util.Scanner;

public class Futbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;
    private final int PREU_INICIAL = 300;
    private final int PUNTS_INICIAL = 5;

    public Futbol(String titular, Redactor redactor, String competicio, String club, String jugador) {
        super(titular, redactor);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public static Futbol noticiaFutbol(Redactor redactor, String titular){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriu la competició a la que fa referència la notícia:");
        String competicio = sc.nextLine();

        System.out.println("Escriu el club al que fa referència la notícia:");
        String club = sc.nextLine();

        System.out.println("Escriu a quin jugador fa referència la noticia:");
        String jugador = sc.nextLine();

        return new Futbol(titular, redactor, competicio, club, jugador);
    }

    @Override
    public void calcularPreuNoticia() {
        int preuFinal = 0;
        if (competicio.equalsIgnoreCase("Lliga de campions")) {
            preuFinal += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preuFinal += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            preuFinal += 50;
        }
        preuFinal = preuFinal + PREU_INICIAL;
        System.out.println("El preu total de la noticia és de: " + preuFinal + " euros.");
    }

    @Override
    public void calcularPunts() {
        int totalPunts = 0;

        if (competicio.equalsIgnoreCase("Lliga de campions")) {
            totalPunts += 3;
        } else if (competicio.equalsIgnoreCase("Liga")) {
            totalPunts += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            totalPunts += 1;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            totalPunts += 1;
        }
        totalPunts = totalPunts + PUNTS_INICIAL;

        System.out.println("El total de punts és de: " + totalPunts + " .");
    }
}
