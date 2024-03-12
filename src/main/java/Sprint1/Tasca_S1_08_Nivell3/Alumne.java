package Sprint1.Tasca_S1_08_Nivell3;

public class Alumne {
    String nom;
    int edat;
    String curs;
    float nota;

    public Alumne(String nom, int edad, String curs, float nota) {
        this.nom = nom;
        this.edat = edad;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "Nom = " + nom +
                ", Edad = " + edat +
                ", Curs = " + curs +
                ", Nota = " + nota ;
    }
}
