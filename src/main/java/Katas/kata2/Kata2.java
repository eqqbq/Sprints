package Katas.kata2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // System.out.println("Escribe la opción del jugador 1:");
       // String jugadaP1 = sc.nextLine();

        //System.out.println("Escribe la opción del jugador 2:");
        //String jugadap2 = sc.nextLine();

        //comparador(jugadaP1, jugadap2);

        ArrayList<String> opciones = new ArrayList<>();
        opciones.add("Tijera");
        opciones.add("Piedra");
        opciones.add("Papel");

        int opcion1 = (int) (Math.random() * 2 + 0);
        int opcion2 = (int) (Math.random() * 2 + 0);


    }

    public static void comparador(String jugadap1, String jugadap2) {
        if (jugadap1.equalsIgnoreCase(jugadap2)) {
            System.out.println("Empate!");
        } else if (jugadap1.equalsIgnoreCase("Tijera") && jugadap2.equalsIgnoreCase("papel")) {
            System.out.println("Jugador 1 gana!");
        } else if (jugadap1.equalsIgnoreCase("Tijera") && jugadap2.equalsIgnoreCase("Piedra")) {
            System.out.println("Jugador 2 gana");
        } else if (jugadap1.equalsIgnoreCase("papel") && jugadap2.equalsIgnoreCase("Tijera")) {
            System.out.println("Jugador 2 gana!");
        } else if (jugadap1.equalsIgnoreCase("papel") && jugadap2.equalsIgnoreCase("piedra")) {
            System.out.println("Jugador 1 gana!");
        } else if (jugadap1.equalsIgnoreCase("piedra") && jugadap2.equalsIgnoreCase("tijera")) {
            System.out.println("Jugador 1 gana!");
        } else if (jugadap1.equalsIgnoreCase("piedra") && jugadap2.equalsIgnoreCase("papel")) {
            System.out.println("Jugador 2 gana!");
        }
    }
}
