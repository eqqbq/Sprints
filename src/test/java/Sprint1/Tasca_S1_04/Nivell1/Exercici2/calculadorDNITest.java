package Sprint1.Tasca_S1_04.Nivell1.Exercici2;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class calculadorDNITest {

    @ParameterizedTest
    @CsvSource( value = {"11375588: H", "37840233: N" , "26231968 : P" , "99176586: B", "61755725 : N",
                        "56891713: V" , "77716620: B", "18244081: K", "61366892: V" , "85862337: W"}, delimiter = ':')

    public void test(int numeroDNI, char letra){
        String dniCalculado = calculadorDNI.calcularLetraDni(numeroDNI);
        char letraCalculada = dniCalculado.charAt(9);
        assertEquals(letraCalculada,letra);
    }
}