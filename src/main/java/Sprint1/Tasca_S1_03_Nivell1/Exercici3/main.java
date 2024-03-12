package Sprint1.Tasca_S1_03_Nivell1.Exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        empiezaJuego(crearLista());

    }
    public static HashMap<String, String> crearLista(){

        HashMap<String, String> llistaPaisos = new HashMap<>();

        String line;


        try (BufferedReader lector = new BufferedReader(new FileReader("countries.txt"))) {
            while ((line = lector.readLine()) != null) {
                String[] keyValuePair = line.split(" ", 2);
                if (keyValuePair.length > 1) {
                    String key = keyValuePair[0].replace("_", " ");
                    String value = keyValuePair[1].replace("_", " ");
                    llistaPaisos.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Se ha encontrado un error.");
            e.printStackTrace();

        }
        return llistaPaisos;
    }
    public static void empiezaJuego(HashMap<String, String> llistaPaisos ){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombreJugador = entrada.nextLine();

        System.out.println( "El listado de paises y de capitales está en inglés por lo que se espera una respuesta en inglés." +
                        "\n" + "Debes introducir el nombre de la capital del siguiente país.");
        int contador = 0;
        for (int i = 0; i < 10; i++){

            int randomNum = (int) (Math.random() * llistaPaisos.size());
            String country = (String) llistaPaisos.keySet().toArray()[randomNum];
            String capitalCorrecta = llistaPaisos.get(country);
            System.out.println(country);
            String respuestaUsuario = entrada.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(llistaPaisos.get(country))){
                contador++;
                System.out.println("Respuesta correcta. Has ganado un punto.");
            } else {
                System.out.println("Respuesta incorrecta.");
            }
        }
        guardarDatosJugador(nombreJugador, contador);
        }


    public static void guardarDatosJugador (String nombreJugador, int contador) {
        try (FileWriter datosJugador = new FileWriter("Resultado.txt", true)){
            String linea = "Jugador : " + nombreJugador + " - Puntos: " + contador + "\n";
            datosJugador.write(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

