package Sprint1.Tasca_S1_04.Nivell2;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class Test2 {

    @Test
    public void longitud6Test(){
        MatcherPersonalitzat longitud6 = new MatcherPersonalitzat(is(6));
        MatcherAssert.assertThat("Mordor", longitud6);
    }

    @Test
    public void longitud8Test(){
        MatcherPersonalitzat longitud8 = new MatcherPersonalitzat(is(8));
        MatcherAssert.assertThat("Mordor", longitud8);
    }
}
