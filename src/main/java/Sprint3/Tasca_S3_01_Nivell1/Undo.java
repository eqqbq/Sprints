package Sprint3.Tasca_S3_01_Nivell1;

import Sprint1.Tasca_S1_01_Nivell3.Redactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {
    private static Undo instance;
    private List<String> commands;
    private static Scanner sc = new Scanner(System.in);

    private Undo() {
        this.commands = new ArrayList<>();
    }

    public static Undo instanciate() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand() {
        System.out.println("Type the command you want to add:");
        String commandToAdd = sc.nextLine();

        commands.add(commandToAdd);
        System.out.println("Command was added correctly.");
    }

    public void removeCommand() {

        if (commands.isEmpty()) {
            System.out.println("Command list is empty");

        } else {

            commands.remove(commands.size() - 1);
        }
    }

    public void showCommands() {
        commands.forEach(System.out::println);
    }

}