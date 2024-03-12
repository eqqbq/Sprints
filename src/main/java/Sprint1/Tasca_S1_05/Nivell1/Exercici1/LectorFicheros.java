package Sprint1.Tasca_S1_05.Nivell1.Exercici1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class LectorFicheros {

    public static void escribirPath() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el path del arbol que quieres generar: ");
        String path = entrada.nextLine();
        File directorio = new File(path);

        leerFicheros(directorio);
    }
    public static void leerFicheros(File directorio) {

        File[] archivos = directorio.listFiles();

        String listaDirectorio = "";
        String listaArchivos = "";

        if (archivos == null) {
            System.out.println("No hay ficheros en este directorio.");

        } else {
            Arrays.sort(archivos);
            for (int i = 0; i < archivos.length; i++) {
                File f = archivos[i];
                if (f.isDirectory()) {
                    listaDirectorio = listaDirectorio + "(D)" + (f) + " " + imprimirFecha(f) + "\n";

                    //System.out.println("--");
                    //System.out.println("(D)" + (f));

                    leerFicheros(f);
                } else if (f.isFile()) {
                    listaArchivos = listaArchivos + "(F)" + f + " " + imprimirFecha(f) + "\n";
                    //System.out.println( "(F)" + f + " " + imprimirFecha(f));
                }
            }
        }
        crearTXT(listaDirectorio, listaArchivos);

    }

    public static void ordenarDirectorio(File directorio){
        String[] listaDirectorio = directorio.list();

        Arrays.sort(listaDirectorio);

        for (String i : listaDirectorio){
            System.out.println(i);
        }
    }

    public static String imprimirFecha(File file){
        Date fecha = new Date(file.lastModified());
        SimpleDateFormat formateador = new SimpleDateFormat( "dd//MM//yyyy");
        String fechaFormateada = formateador.format(fecha);

        return fechaFormateada;
    }

    public static void crearTXT(String listaDirectorio, String listaArchivos){

        try (FileWriter arbolDirectorio = new FileWriter("ArbolDirectorio.txt", true)){
            String cabezera = "----------";
            String linea = listaDirectorio + " " + listaArchivos;
            arbolDirectorio.write(cabezera + "\n");
            arbolDirectorio.write(linea + "\n ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerTXT(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el path del txt que quieres que se lea: ");
        String pathTXT = entrada.nextLine();

        String line;

        try (BufferedReader lector = new BufferedReader(new FileReader(pathTXT))) {
            int i = 0;
            while ((i = lector.read()) != -1)
                System.out.print((char)i);
        } catch (IOException e) {
            System.out.println("Se ha encontrado un error.");
            e.printStackTrace();

        }
    }

    public static void serializarObjeto(){
        Empleado empleado1 = new Empleado("Paco", 30, 1500);
        File file = new File("empleado.ser");

        try(FileOutputStream fos = new FileOutputStream(file)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empleado1);

            System.out.println("Se ha serializado el objeto." + "\n" + "Nombre: " + empleado1.getNombre() + "\n"
            + "Edad: " + empleado1.getEdad() + "\n" + "Salario: " + empleado1.getSalario());

        }catch (Exception e){
            System.out.println("Se ha producido un error.");
        }
    }

    public static void deserializarObjeto(){

        try (FileInputStream fis = new FileInputStream("empleado.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)){
             Empleado empleado2 = (Empleado) ois.readObject();

            System.out.println("Se ha deserializado el objeto." + "\n" + "Nombre:" + empleado2.getNombre() + "\n"
                    + "Edad: " + empleado2.getEdad() + "\n" + "Salario: " + empleado2.getSalario());

        }catch(Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}


