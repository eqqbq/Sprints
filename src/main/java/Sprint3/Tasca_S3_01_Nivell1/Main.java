package Sprint3.Tasca_S3_01_Nivell1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Undo commands = Undo.instanciate();

        int option = 0;

        do {
            System.out.println("Choose an option: \n" +
                    "1. Add command. \n" +
                    "2. Remove command. \n" +
                    "3. Show commands added. \n" +
                    "4. Close.");

            option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    commands.addCommand();
                    break;
                case 2:
                    commands.removeCommand();
                    break;
                case 3:
                    commands.showCommands();
                    break;
            }

        } while (option != 4);
    }
}
