package Sprint1.Tasca_S1_06_Nivell2.Exercici2;

public class GenericMethods <S> {
    public void impresionArgumentos(S... arguments){
       for (S arg : arguments){
           System.out.println(arg);
       }
    }
}