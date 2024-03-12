package Sprint1.Tasca_S1_02_Nivell1.Exercici1;

public class VendaBuidaException extends java.lang.Exception {

    private String exceptio = "";

    public VendaBuidaException (String exceptio){
        this.exceptio = "Per fer una venda primer has d'afegir productes.";
    }

    public String getMessage(){
        return this.exceptio;
    }
}
