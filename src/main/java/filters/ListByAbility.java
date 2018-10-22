package filters;

import models.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class ListByAbility {
    public ArrayList<Vehicles> flyAbles = new ArrayList();
    public ArrayList<Vehicles> moveAbles = new ArrayList();
    public ArrayList<Vehicles> swimAbles = new ArrayList();

    @Override
    public String toString() {
        return "ListOfVehicleByFlyMoveSwim{" +
                "flyAbles=" + flyAbles +
                ", moveAbles=" + moveAbles +
                ", swimAbles=" + swimAbles +
                '}';
    }
}
