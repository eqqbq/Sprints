package Sprint1.Tasca_S1_07_Nivell1.Exercici1;

public class SupressWarnings {

    @SuppressWarnings("deprecation")
    public static void suppressWarnings(){
        Treballador treballador = new Treballador("Juan", "Sánchez", 8.4d);
        treballador.ejemploDeprecated();
    }
}
