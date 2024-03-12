package Sprint1.Tasca_S1_01_Nivell2.Exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void trucant(String numTelefon){
        System.out.println("S'he està trucant al número " + numTelefon);
    }
    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma");
    }
}
