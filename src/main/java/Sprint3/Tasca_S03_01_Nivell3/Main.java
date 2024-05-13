package Sprint3.Tasca_S03_01_Nivell3;

import Sprint3.Tasca_S03_01_Nivell3.Commands.*;
import Sprint3.Tasca_S03_01_Nivell3.Parking.*;

public class Main {
    public static void main(String[] args) {

        CommandList commandList = new CommandList();

        commandList.addCommand(new Accelerate());
        commandList.addCommand(new Brake());
        commandList.addCommand(new StartUp());

        CommandExecuter commandExecuter = new CommandExecuter();

        Vehicle Airplane = new Airplane("ASD", "White", 100000);
        Vehicle Ship = new Ship("qwe", "Black", 50000);
        Vehicle Car = new Car("iop", "Green", 20000);
        Vehicle Bycicle = new Bycicle("ñlk", "Red", 200);

        commandExecuter.execute(commandList, Airplane );
        commandExecuter.execute(commandList, Ship );
        commandExecuter.execute(commandList, Car );
        commandExecuter.execute(commandList, Bycicle );

    }

}