package Sprint3.Tasca_S3_02_Nivell1;


import java.util.ArrayList;
import java.util.List;

public class BorsaAgencies implements Observer {

    private String name;

    public BorsaAgencies(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String parameter) {
        System.out.println( this.getName() + "has been updated.");
    }

    @Override
    public String toString() {
        return "BorsaAgencies{" +
                "name='" + name + '\'' +
                '}';
    }
}
