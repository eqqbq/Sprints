package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

public class Treballador {
    private String nom;
    private String cognom;
    private double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public double getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(int preuHora) {
        this.preuHora = preuHora;
    }

    public void calcularSueldo(double horasTreballades){
        System.out.println("El sou d'un treballador: " + preuHora * horasTreballades + " euros.");
    }

    @Override
    public String toString() {
        return "Treballador: " +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", preuHora=" + preuHora;
    }

    @Deprecated
    public void ejemploDeprecated(){
        System.out.println("Ejemplo deprecated");
    }
}
