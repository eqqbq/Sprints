package Sprint1.Tasca_S1_01_Nivell1.exercici1;


public class Percussio extends Instruments {

    public Percussio(String nom, int preu) {
        super(nom, preu);
    }

    @Override
    public String tocar() {
        return "Està sonant un instrument de percussió";
    }

    public void texto(){
        System.out.println("texto.");
    }


}
