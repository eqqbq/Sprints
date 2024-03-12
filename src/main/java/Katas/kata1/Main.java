package Katas.kata1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una palabra:");
        String palabra = sc.next().toLowerCase();

        cifrado(palabra);
    }

    public static void cifrado(String palabra) {
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'};

        int i = 0;
        int auxiliar = 0;
        for (i = 0; i < palabra.length(); i++) {
            for (char letra : abecedario) {
                if (palabra.charAt(i) == letra) {
                    palabra = palabra.replace(palabra.charAt(i), abecedario[ Arrays.binarySearch(abecedario, letra) + 13]);
                }
            }
        }
        System.out.println(palabra);
    }
}
