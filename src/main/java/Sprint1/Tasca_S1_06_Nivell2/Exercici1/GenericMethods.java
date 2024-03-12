package Sprint1.Tasca_S1_06_Nivell2.Exercici1;

public class GenericMethods {

    public static <S, Integer> void impresionArgumentos (S arg1, S arg2, Integer noGenNum){
        System.out.println("Argumento genérico 1: " + arg1);
        System.out.println("Argumento genérico 2: " + arg2);
        System.out.println("Argumento genérico 3: " + noGenNum);
    }
}