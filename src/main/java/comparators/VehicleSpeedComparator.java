package comparators;

import models.Vehicles;

import java.util.Comparator;

public class VehicleSpeedComparator implements Comparator<Vehicles>{
    public int compare(Vehicles o1, Vehicles o2) {
        if (o1.getPrice()>=o2.getPrice()){return 1;}
        else if (o1.getPrice() == o2.getPrice()){return 0;}
        else {return -1;}
    }
}
