package Sprint1.Tasca_S1_01_Nivell1.exercici1;


public class Vent extends Instruments {

    public Vent(String nom, int preu) {
        super(nom, preu);
    }

    public String tocar() {
        return "Està sonant un instrument de vent";
    }
}
