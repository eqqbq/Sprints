package Sprint1.Tasca_S1_03_Nivell2.Exercici1;

import java.util.Objects;

public class Restaurant {

    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }


    @Override
    public String toString() {
        return  "Nom: " + nom  + " Puntuacio: " + puntuacio + "\n" ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant nouRestaurant)) return false;
        return this.puntuacio == nouRestaurant.getPuntuacio() && this.nom.equals(nouRestaurant.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

}
