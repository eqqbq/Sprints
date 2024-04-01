package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

public class TreballadorOnline extends Treballador{
    private final double TARIFA_PLANA_INTERNET = 40d;
    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    public void calcularSueldo(double horasTreballades) {
        System.out.println("El sou d'un treballador online es de: "
                + (this.preuHora * horasTreballades + TARIFA_PLANA_INTERNET) + " euros");
    }

    @Override @Deprecated
    public void ejemploDeprecated(){
        System.out.println("Ejemplo deprecated");
    }
}
