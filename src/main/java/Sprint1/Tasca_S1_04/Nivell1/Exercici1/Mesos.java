package Sprint1.Tasca_S1_04.Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.List;

public class Mesos {

    List<String> meses;

    public Mesos(ArrayList<String> meses) {
        this.meses = new ArrayList<String>();
    }


    public void mesesLista(){
        meses.add("Gener");
        meses.add("Febrer");
        meses.add("Març");
        meses.add("Abril");
        meses.add("Maig");
        meses.add("Juny");
        meses.add("Juliol");
        meses.add("Agost");
        meses.add("Septembre");
        meses.add("Octubre");
        meses.add("Novembre");
        meses.add("Decembre");
    }

    public List<String> getMeses() {
        return meses;
    }
}
