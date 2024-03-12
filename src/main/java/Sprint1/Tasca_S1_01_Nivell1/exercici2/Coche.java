package Sprint1.Tasca_S1_01_Nivell1.exercici2;

public class Coche {
    private static final String MARCA = "MARCA";
    private static String model;
    private final int POTENCIA;

    public Coche(int potencia) {
        this.POTENCIA = potencia;
        this.model = "renault";
    }

    //Getters
    public String getMarca(){
        return MARCA;
    }

    public String getModel(){
        return model;
    }

    public int getPotencia(){
        return POTENCIA;
    }

    public void setModel(){
        model = model;
    }

    public static String frenar(){
        return "El vehícle està frenant.";
    }
    public String accelerar(){
        return "El vehicle està accelerant.";
    }

    public String toString(){
        return "El cotxe amb el model " + this.getModel() + " de la marca " + this.getMarca() +
                " té una potència de " + this.getPotencia();
    }
}
