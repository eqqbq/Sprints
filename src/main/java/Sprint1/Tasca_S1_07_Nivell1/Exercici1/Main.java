package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

public class Main {
    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        Treballador treballador = new Treballador("Oscar", "Sánchez", 7.0d);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jesús", "Macías", 9.5d);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Claudia", "Martínez", 7.8d);

        treballador.calcularSueldo(40);
        treballadorPresencial.calcularSueldo(50);
        treballadorOnline.calcularSueldo(30);

        treballador.ejemploDeprecated(); //Advertencia método deprecated
    }
}
