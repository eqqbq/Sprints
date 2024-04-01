package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

@Deprecated
public class Main {
    public static void main(String[] args) {

        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Jesús", "Macías", 9.5d);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Claudia", "Martínez", 7.8d);


        treballadorPresencial.calcularSueldo(50);
        treballadorOnline.calcularSueldo(30);

        treballadorPresencial.ejemploDeprecated(); //Ejemplo método deprecated
    }
}
