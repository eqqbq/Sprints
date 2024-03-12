package Sprint1.Tasca_S1_05.Nivell1.Exercici1;

import java.io.Serializable;

public class Empleado  implements Serializable {
    private String Nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        Nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
