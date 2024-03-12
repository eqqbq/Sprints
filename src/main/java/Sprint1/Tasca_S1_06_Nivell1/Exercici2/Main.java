package Sprint1.Tasca_S1_06_Nivell1.Exercici2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Paco", "Gómez", 40);
        String string1 = "Ejemplo String";
        int numero = 123;

        GenericMethods.impresionArgumentos(persona, string1, numero);
    }
}
