package Sprint1.Tasca_S1_01_Nivell3;

public abstract class Noticia {

    protected Redactor redactor;
    protected String text = "";
    protected String titular;
    protected int puntuacio;
    protected int preu;

    public Noticia(String titular, Redactor redactor) {
        this.titular = titular;
        this.redactor = redactor;
    }

    public Redactor getRedactor() {
        return redactor;
    }

    public void setRedactor(Redactor redactor) {
        this.redactor = redactor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public abstract void calcularPreuNoticia();

    public abstract void calcularPunts();
}
