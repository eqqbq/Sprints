package Sprint1.Tasca_S1_08_Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Alumne> listaAlumnes = new ArrayList<>();
        listaAlumnes.add(new Alumne("Javi", 20, "Java", 8));
        listaAlumnes.add(new Alumne("Silvia", 28, "PHP", 9));
        listaAlumnes.add(new Alumne("Dani", 30, "Go", 7.2f));
        listaAlumnes.add(new Alumne("Sandra", 23, "Java", 6));
        listaAlumnes.add(new Alumne("Meri", 16, "JavaScript", 3));
        listaAlumnes.add(new Alumne("Miguel", 15, "PHP", 4));
        listaAlumnes.add(new Alumne("Angel", 32, "C++", 2));
        listaAlumnes.add(new Alumne("Andres", 32, "Java", 5));

        mostrarAlumnos(listaAlumnes);
        empiezanPorA(listaAlumnes);
        notaMayorIgual5(listaAlumnes);
        notaMayorIgual5NoPHP(listaAlumnes);
        mayorEdadJava(listaAlumnes);
    }

    public static void mostrarAlumnos(List<Alumne> listaAlumnes) {

        System.out.println("Listado de alumnos:" + "\n");

        listaAlumnes.forEach(alumne -> System.out.println("Nom = " + alumne.getNom() + ", Edad = " + alumne.getEdat()));
        System.out.println("----------------");
    }

    public static void empiezanPorA(List<Alumne> listaAlumnes) {

        List<Alumne> listaEmpiezanPorA = listaAlumnes.stream()
                .filter(alumne -> alumne.getNom().toLowerCase().startsWith("a"))
                .toList();

        System.out.println("Alumnos cuyo nombre empieza por 'A':" + "\n");
        listaEmpiezanPorA.forEach(System.out::println);
        System.out.println("----------------");

    }

    public static void notaMayorIgual5(List<Alumne> listaAlumnes){

         List<Alumne> listaNotaMayorIgual5 = listaAlumnes.stream()
                .filter(alumne -> alumne.getNota() >= 5)
                .toList();

        System.out.println("Alumnos cuya nota es igual o mayor a 5:" + "\n");
        listaNotaMayorIgual5.forEach(System.out::println);
        System.out.println("----------------");
    }

    public static void notaMayorIgual5NoPHP(List<Alumne> listaAlumnes){

        List<Alumne> listaNotaMayorIgual5NoPHP = listaAlumnes.stream()
                .filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equalsIgnoreCase("PHP"))
                .toList();

        System.out.println("Alumnos cuya nota es igual o mayor a 5 y no cursan PHP:" + "\n");
        listaNotaMayorIgual5NoPHP.forEach(System.out::println);
        System.out.println("----------------");
    }

    public static void mayorEdadJava(List<Alumne> listaAlumnes){

        List<Alumne> listaMayorEdadJava = listaAlumnes.stream()
                .filter(alumne -> alumne.getEdat() >= 18 && alumne.getCurs().equalsIgnoreCase("Java"))
                .toList();

        System.out.println("Alumnos mayores de edad que cursan Java:" + "\n");
        listaMayorEdadJava.forEach(System.out::println);
        System.out.println("----------------");
    }
}
