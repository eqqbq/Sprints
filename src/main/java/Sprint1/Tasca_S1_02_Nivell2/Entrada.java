package Sprint1.Tasca_S1_02_Nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner entrada = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        System.out.println(missatge);
        boolean valorValido = false;
        byte valorIntroducido = 0;

        while (!valorValido) {
            try {
                valorIntroducido = entrada.nextByte();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato, introduce un byte: ");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        return valorIntroducido;
    }

    public static int llegirInt(String missatge) {
        System.out.println(missatge);
        boolean valorValido = false;
        int valorIntroducido = 0;

        while (!valorValido) {
            try {
                valorIntroducido = entrada.nextInt();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato, introduce un int: ");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        return valorIntroducido;
    }

    public static float llegirFloat(String missatge){
        System.out.println(missatge);
        boolean valorValido = false;
        float valorIntroducido = 0.0f;

        while (!valorValido){
            try{
                valorIntroducido = entrada.nextFloat();
                valorValido = true;
            } catch (InputMismatchException e){
                System.out.println("Error de formato, introduce un float: ");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        return valorIntroducido;
    }

    public static double llegirDouble(String missatge){
        System.out.println(missatge);
        boolean valorValido = false;
        double valorIntroducido = 0.0d;

        while (!valorValido){
            try{
                valorIntroducido = entrada.nextDouble();
                valorValido = true;
            } catch (InputMismatchException e){
                System.out.println("Error de formato, introduce un double: ");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        return valorIntroducido;
    }

    public static char llegirChar(String missatge){
        System.out.println(missatge);
        boolean valorValido = false;
        char valorIntroducido = ' ';

        while (!valorValido){
            try {
                valorIntroducido = entrada.next().charAt(0);
                valorValido = true;

            } catch (Exception e){
                System.out.println("Error de formato, introduce un char: ");
                entrada.nextLine();
            }
        }
        entrada.nextLine();
        return valorIntroducido;
    }

    public static String llegirString(String missatge){
        System.out.println(missatge);
        boolean valorValido = false;
        String stringIntroducida = " ";

        while (!valorValido){
            try {
                stringIntroducida = entrada.nextLine();
                valorValido = true;
            } catch (Exception e){
                System.out.println("Has de escribir algo: ");
            }
        }
        return stringIntroducida;
    }

    public static boolean llegirSiNo(String missatge){
        System.out.println(missatge);
        boolean valorValido = false;
        boolean siNo = false;
        String stringIntroducida = "";

        while(!valorValido){
            try {
                stringIntroducida = entrada.nextLine().toLowerCase();

                if (stringIntroducida.equals("s")){
                    siNo = true;
                    valorValido = true;
                } else if ( stringIntroducida.equals("n")){
                    valorValido = true;
                }else{
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Error en el formato, escribe 's' o 'n' : ");
            }
        }
        return siNo;
    }
}
