package Sprint1.Tasca_S1_06_Nivell2.Exercici1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Paco", "Gómez", 40);
        String string1 = "Ejemplo String";

        GenericMethods.impresionArgumentos(persona, string1, 123);
    }
}
