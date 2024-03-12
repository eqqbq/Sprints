package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

public class TreballadorPresencial extends Treballador{
    private static double benzina = 30d;

    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    @Override
    public void calcularSueldo(double horasTreballades){
        System.out.println("El sou d'un treballador presencial es de: "
                + (getPreuHora() * horasTreballades + benzina) + " euros.");

    }

    @Deprecated
    public void ejemploDeprecated(){
        System.out.println("Ejemplo deprecated");
    }
}
