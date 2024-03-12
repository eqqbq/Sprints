package Sprint1.Tasca_S1_04.Nivell1.Exercici3;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionGeneradorTest {

    @Test
    public void testException(){
        assertThrows(ArrayIndexOutOfBoundsException.class, ArrayExceptionGenerador::generadorException);
    }

}