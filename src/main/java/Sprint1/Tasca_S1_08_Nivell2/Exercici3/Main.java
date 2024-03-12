package Sprint1.Tasca_S1_08_Nivell2.Exercici3;

public class Main {
    public static void main(String[] args) {

        Operaciones suma = (a,b) -> a + b;
        Operaciones resta = (a,b) -> a - b;
        Operaciones multipliacio = (a,b) -> a * b;
        Operaciones divisio = (a,b) -> a / b;

        float resultatSuma = suma.operacio(10,4);
        float resultatResta = resta.operacio(10,4);
        float resultatMultiplicacio = multipliacio.operacio(10,4);
        float resultatDiviso = divisio.operacio(6,4);

        System.out.println("Resultat de la suma: " + resultatSuma);
        System.out.println("Resultat de la resta: " + resultatResta);
        System.out.println("Resultat de la multiplicació: " + resultatMultiplicacio);
        System.out.println("Resultat de la divisió: " + resultatDiviso);
    }
}
