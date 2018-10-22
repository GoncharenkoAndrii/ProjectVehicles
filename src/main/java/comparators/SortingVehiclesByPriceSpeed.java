package comparators;

import models.Vehicles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class SortingVehiclesByPriceSpeed {
    public TreeSet<Vehicles> sortVehiclesByPriceSpeed (ArrayList<Vehicles> vhcl){
        Comparator<Vehicles> comp = new VehiclePriceComparator().thenComparing(new VehicleSpeedComparator());
        TreeSet<Vehicles> sortedVhcl = new TreeSet<Vehicles>();
        for (Vehicles cur : vhcl ){
            sortedVhcl.add(cur);
        }
        return sortedVhcl;
    }
}
