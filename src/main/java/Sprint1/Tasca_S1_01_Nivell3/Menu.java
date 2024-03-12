package Sprint1.Tasca_S1_01_Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Redactor> llistaRedactors = new ArrayList<>();

    public static void iniciarMenu() {

        Scanner sc = new Scanner(System.in);

        int opcio = 0;

        do {
            System.out.println("""
                    Escull una opció. \s
                    1. Introduir redactor. \s
                    2. Eliminar redactor. \s
                    3. Introduir notícia a un redactor. \s
                    4. Eliminar notícia. \s
                    5. Mostrar totes les notícies per redactor. \s
                    6. Calcular puntuació de la noticia. \s
                    7. Calcular preu-noticia. \s
                    8. Sortir.""");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {

                case 1:
                    introducirRedactor(sc);
                    break;
                case 2:
                    eliminarRedactor(sc);
                    break;
                case 3:
                    introducirNoticia(sc);
                    break;
                case 4:
                    eliminarNoticia(sc);
                    break;
                case 5:
                    mostrarNoticias(sc);
                    break;
                case 6:
                    puntuacioNoticia(sc);
                    break;
                case 7:
                    preuNoticia(sc);
                    break;
            }

        } while (opcio != 8);
    }

    public static void introducirRedactor(Scanner sc) {

        System.out.println("Escriu el nom del redactor:");
        String nom = sc.nextLine();

        System.out.println("Escriu el DNI del redactor:");
        String dni = sc.nextLine();

        llistaRedactors.add(new Redactor(nom, dni));

        System.out.println("S'ha introduït el redactor: " + nom + ".");
    }

    public static String eliminarRedactor(Scanner sc) {

        System.out.println("Escriu el nom del redactor que vols eliminar: ");
        String redactorEliminar = sc.nextLine();

        for (Redactor redactor : llistaRedactors) {
            if (redactorEliminar.equalsIgnoreCase(redactor.getNom())) {
                llistaRedactors.remove(redactor);
                return "S'ha eliminat correctament";
            }
        }
        return "No s'ha trobat el redactor.";
    }

    public static void introducirNoticia(Scanner sc) {

        Redactor redactorEncontrado = encontrarRedactor(sc, "Escriu el redactor de la noticia que vols afegir:");

        System.out.println("Escriu el titular de la noticia: ");
        String titular = sc.nextLine();

        int opcio = 0;

        do {
            System.out.println("""
                    Escriu el tipus de noticia que vols afegir:\s
                    1. Futbol.\s
                    2. Bàsquet\s
                    3. Tenis\s
                    4. F1\s
                    5. Motociclisme\s
                    6. Sortir.""");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    redactorEncontrado.getListaNoticias().add(Futbol.noticiaFutbol(redactorEncontrado, titular));

                    break;
                case 2:
                    redactorEncontrado.getListaNoticias().add(Basquet.noticiaBasquet(redactorEncontrado, titular));

                    break;
                case 3:
                    redactorEncontrado.getListaNoticias().add(Tenis.noticiaTenis(redactorEncontrado, titular));

                    break;
                case 4:
                    redactorEncontrado.getListaNoticias().add(F1.noticiaF1(redactorEncontrado, titular));

                    break;
                case 5:
                    redactorEncontrado.getListaNoticias().add(Motociclisme.noticiaMotociclisme(redactorEncontrado, titular));

                    break;
                case 6:
                    System.out.println("Operació cancelada.");

                    break;
            }
        } while (opcio != 6);
    }


    public static String eliminarNoticia(Scanner sc) {

        System.out.println("Escriu el redactor de la notícia que vols eliminar: ");
        String selecRedactor = sc.nextLine();

        System.out.println("Escriu el titular de la notícia que vols eliminar: ");
        String eliminarTitular = sc.nextLine();

        for (Redactor redactor : llistaRedactors) {
            if (selecRedactor.equalsIgnoreCase(redactor.getNom())) {
                List<Noticia> listaNoticias = redactor.getListaNoticias();
                for (Noticia noticia : listaNoticias) {
                    if (eliminarTitular.equalsIgnoreCase(noticia.getTitular())) {
                        listaNoticias.remove(noticia);
                        redactor.setListaNoticias(listaNoticias);
                        return "S'ha eliminat correctament la noticia.";
                    }
                }
            }
        }
        return "No s'ha pogut eliminar la noticia.";
    }

    public static void mostrarNoticias(Scanner sc) {

        Redactor redactorEncontrado = encontrarRedactor(sc, "Escriu el nom del redactor que vols veure les seves notícies");

        System.out.println(redactorEncontrado.toString());
    }

    public static void puntuacioNoticia(Scanner sc) {

        Redactor redactorEncontrado = encontrarRedactor(sc, "Escriu el redactor de la noticia que vols calcular:");

        Noticia noticiaTitular = encontrarNoticia(sc, "Escriu el titular de la noticia que vols calcular: ", redactorEncontrado);

        noticiaTitular.calcularPunts();
    }

    public static void preuNoticia(Scanner sc) {

        Redactor redactorEncontrado = encontrarRedactor(sc, "Escriu el redactor de la noticia que vols calcular:");

        Noticia noticiaTitular = encontrarNoticia(sc, "Escriu el titular de la noticia que vols calcular: ", redactorEncontrado);

        noticiaTitular.calcularPreuNoticia();
    }

    public static Redactor encontrarRedactor(Scanner sc, String text) {

        System.out.println(text);
        String redactorEncontrar = sc.nextLine();

        for (Redactor redactor : llistaRedactors) {
            if (redactorEncontrar.equalsIgnoreCase(redactor.getNom())) {
                return redactor;
            }
        }
        return null;
    }

    public static Noticia encontrarNoticia(Scanner sc, String text, Redactor redactor) {

        System.out.println(text);
        String noticiaEncontrar = sc.nextLine();

        for (Noticia noticia : redactor.getListaNoticias()) {
            if (noticiaEncontrar.equalsIgnoreCase(noticia.getTitular())) {
                return noticia;
            }
        }
        return null;
    }
}
