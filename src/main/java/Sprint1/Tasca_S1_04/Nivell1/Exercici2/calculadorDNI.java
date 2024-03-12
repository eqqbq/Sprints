package Sprint1.Tasca_S1_04.Nivell1.Exercici2;

public class calculadorDNI {

    public static String calcularLetraDni(int numeroDNI) {

    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    char letra = letras[ numeroDNI % 23];

    return numeroDNI + " " + letra;

    }
}
