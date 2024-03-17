package Sprint1.Tasca_S1_03_Nivell2.Exercici2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static HashSet<Sprint1.Tasca_S1_03_Nivell2.Exercici1.Restaurant> hashRestaurant = new HashSet<Sprint1.Tasca_S1_03_Nivell2.Exercici1.Restaurant>();

    public static void iniciarMenu() {
        int opcio = 0;

        do {
            System.out.println("Escogeix el que vols fer:" + "\n" + "1. Introduir restaurant." + "\n"
                    + "2. Veure restaurants." + "\n" + "3. Veure restaurants ordenats per puntuació." + "\n" + "4. Sortir.");

            opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
                case 1:
                    introduirRestaurant(hashRestaurant, sc);
                    break;
                case 2:
                    verRestaurant(hashRestaurant, sc);
                    break;
                case 3:
                    verRestaurantOrdenats(hashRestaurant, sc);
            }

        } while (opcio != 4);
    }

    public static void introduirRestaurant(HashSet hashRestaurant, Scanner sc) {

        System.out.println("Escriu el nom del restaurant:");
        String nom = sc.nextLine();

        System.out.println("Escriu la puntuació del restaurant: ");
        int puntuacio = sc.nextInt();
        sc.nextLine();

        Restaurant restauranteNuevo = new Restaurant(nom, puntuacio);

        hashRestaurant.add(restauranteNuevo);
        System.out.println("S'ha introduït correctament.");
    }

    public static void verRestaurant(HashSet hashRestaurant, Scanner sc) {
        hashRestaurant.forEach(System.out::println);
    }

    public static void verRestaurantOrdenats(HashSet hashRestaurant, Scanner sc){

        TreeSet<Restaurant> restaurantsTreeSet = new TreeSet<>(hashRestaurant);
        restaurantsTreeSet.forEach(System.out::println);
    }
}

