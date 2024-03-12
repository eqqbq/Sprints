package Sprint1.Tasca_S1_01_Nivell3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    String nom;
    final String dni;
    int sou;

    List<Noticia> llistaNoticias = new ArrayList<>();

    public void setListaNoticias(List<Noticia> listaNoticias) {
        this.llistaNoticias = listaNoticias;
    }

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.sou = 1500;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    public List<Noticia> getListaNoticias() {
        return llistaNoticias;
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nom='" + nom + '\'' +
                ", dni='" + dni + '\'' +
                ", sou=" + sou +
                ", listaNoticias=" + llistaNoticias +
                '}';
    }
}
