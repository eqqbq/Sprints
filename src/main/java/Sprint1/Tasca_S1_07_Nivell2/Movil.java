package Sprint1.Tasca_S1_07_Nivell2;

@Serializer
public class Movil {

    private String marca;
    private int numModelo;

    public Movil(String marca, int numModelo) {
        this.marca = marca;
        this.numModelo = numModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumModelo() {
        return numModelo;
    }

    public void setNumModelo(int numModelo) {
        this.numModelo = numModelo;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", numModelo=" + numModelo +
                '}';
    }
}
