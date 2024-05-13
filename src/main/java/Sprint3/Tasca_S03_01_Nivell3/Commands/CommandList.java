package Sprint3.Tasca_S03_01_Nivell3.Commands;

import Sprint3.Tasca_S03_01_Nivell3.Parking.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements VehicleCommands{

    private List<VehicleCommands> commandsList = new ArrayList<>();

    public void addCommand(VehicleCommands command){
        commandsList.add(command);
    }
    @Override
    public void execute(Vehicle vehicle) {
        commandsList.forEach(x -> x.execute(vehicle));
    }
}
