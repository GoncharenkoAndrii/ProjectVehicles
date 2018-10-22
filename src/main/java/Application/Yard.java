package Application;

import filters.VehicleFilters;
import models.*;

import java.util.ArrayList;

public class Yard {
    static ArrayList<Vehicles> vehiclesProducted = new ArrayList<Vehicles>();
    /**
     * This method has to be user-oriented
     */

    private static void fillTheYard(){
        //1
        vehiclesProducted.add(new Car(200,2005,2,"b"));
        //2
        Plane pln1 = new Plane(2,1996,5,"AH");
        pln1.setMaxHeight(3000);
        pln1.setPassengersCapasity(150);
        vehiclesProducted.add(pln1);
        //3
        vehiclesProducted.add(new Car(160,2003,5,"opel"));
        //4
        vehiclesProducted.add(new Car(160,1923,3,"opel"));
        //5
        vehiclesProducted.add(new Ship.Builder(130,2001,4)
                .name("ship1")
                .portOfService("Tortuga")
                .passengersCapacity(400).build());
        //6
        vehiclesProducted.add(new Ship.Builder(130,2010,4)
                .name("ship1")
                .portOfService("Tortuga")
                .passengersCapacity(400).build());
        //7
        vehiclesProducted.add(new BatCar(1000,2018,10,"THE ONLY"));
        //8
        vehiclesProducted.add(new AmphibiaCar(290,1945,2,"turtle"));

    }

    public static void main(String[] args) {
        fillTheYard();
        //Use of filter1
        ArrayList<Vehicles> filterOne = VehicleFilters.getPlanesBySpeedRange(vehiclesProducted);
        for (Vehicles curr : filterOne){
            System.out.println(curr.toString());
        }
        //filter2
        ArrayList<Vehicles> filterTwo = VehicleFilters.getPlanesByYearAndHeight(vehiclesProducted);
        for (Vehicles curr : filterTwo){
            System.out.println(curr.toString());
        }
        //filter3
        System.out.println(VehicleFilters.getVehiclesInOrder(vehiclesProducted));

    }

}
