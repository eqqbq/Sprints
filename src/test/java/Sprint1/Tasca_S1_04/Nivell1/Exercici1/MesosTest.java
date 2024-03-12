package Sprint1.Tasca_S1_04.Nivell1.Exercici1;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MesosTest {
    Mesos mesos;

    @BeforeEach
    public void preparacionLista(){
        mesos = new Mesos(new ArrayList<String>());
        mesos.mesesLista();
    }

    @Test
    public void testSizeLlista(){

        assertEquals(mesos.getMeses().size(), 12);

    }

    @Test
    public void llistaNotNull() {

        assertNotNull(mesos.getMeses());
    }

    @Test
    public void testAgost (){

        assertEquals("Agost", mesos.getMeses().get(7));
    }
}
