package Sprint1.Tasca_S1_01_Nivell1.exercici1;
public abstract class Instruments {

    private String nom;
    private int preu;

    public Instruments(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public int getPreu() {
        return preu;
    }

    //Setter

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public abstract String tocar();

    public static void ejemploStatic(){
        System.out.println("Ejemplo método stático.");
    }
}
