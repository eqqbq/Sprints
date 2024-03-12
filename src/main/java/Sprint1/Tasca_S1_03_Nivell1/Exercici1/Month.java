package Sprint1.Tasca_S1_03_Nivell1.Exercici1;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Mes: " + this.getName();
    }
}
