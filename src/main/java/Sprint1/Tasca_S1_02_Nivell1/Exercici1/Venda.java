package Sprint1.Tasca_S1_02_Nivell1.Exercici1;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> colleccioProductes = new ArrayList<>();
    private int preuVenta;

    public Venda(ArrayList<Producte> colleccioProductes, int preuVenta) {
        this.colleccioProductes = colleccioProductes;
        this.preuVenta = preuVenta;
    }

    public String getColleccioProductes(ArrayList<Producte> colleccioProductes) {

        String textoAuxiliar = "";
        for (Producte producte : colleccioProductes) {
            textoAuxiliar += producte + " ";
        }
        return textoAuxiliar;
    }

    public int getPreuVenta() {
        return preuVenta;
    }

    public void setPreuVenta(int preuVenta) {
        this.preuVenta = preuVenta;
    }

    public void calcularTotal() throws VendaBuidaException {
        int j = 0;
        if (this.colleccioProductes.size() <= 0) {
            throw new VendaBuidaException();
        }
        for (Producte producte : this.colleccioProductes) {
            j += producte.getPreu();
        }
        setPreuVenta(j);
    }
}

