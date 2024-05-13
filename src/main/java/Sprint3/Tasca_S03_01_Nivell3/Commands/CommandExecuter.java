package Sprint3.Tasca_S03_01_Nivell3.Commands;

import Sprint3.Tasca_S03_01_Nivell3.Parking.Vehicle;

public class CommandExecuter {

    public void execute(VehicleCommands command, Vehicle vehicle){
        command.execute(vehicle);
    }
}
