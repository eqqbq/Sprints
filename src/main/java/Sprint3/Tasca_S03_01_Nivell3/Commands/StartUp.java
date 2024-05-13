package Sprint3.Tasca_S03_01_Nivell3.Commands;

import Sprint3.Tasca_S03_01_Nivell3.Parking.Vehicle;

public class StartUp implements VehicleCommands{
    @Override
    public void execute(Vehicle vehicle) {
        System.out.println(vehicle + " is starting up.");
    }
}
