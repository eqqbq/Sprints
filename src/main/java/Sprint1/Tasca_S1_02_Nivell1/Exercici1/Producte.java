package Sprint1.Tasca_S1_02_Nivell1.Exercici1;

public class Producte {
    private String nom;
    private int preu;

    public Producte(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }
}
