package filters;

import comparators.SortingVehiclesByPriceSpeed;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleFilters {
    /**
     * Method returns planes , producted fater 2000 and with max height over 5000
     */
    public static ArrayList<Vehicles> getPlanesByYearAndHeight(ArrayList<Vehicles> maybePlanes) {
        final int MIN_YEAR_LIMIT = 2000;
        final int MIN_HEIGHT_LIMIT = 5000;

        ArrayList<Vehicles> justPlanes = new ArrayList<Vehicles>();

        for (Vehicles current : maybePlanes) {
            if (current instanceof Plane) {
                if (current.getYearOfProduction() >= MIN_YEAR_LIMIT) {
                    if (((Plane) current).getMaxHeight() >= MIN_HEIGHT_LIMIT) {
                        justPlanes.add(current);
                    }
                }
            }
        }
        return justPlanes;
    }

    /**
     * Method returns Planes with speed in range[200;500]
     */

    public static ArrayList<Vehicles> getPlanesBySpeedRange(ArrayList<Vehicles> maybePlanes) {
        final int MAX_SPEED = 500;
        final int MIN_SPEED = 200;

        ArrayList<Vehicles> justPlanes = new ArrayList<Vehicles>();

        for (Vehicles current : maybePlanes) {
            if (current instanceof Plane) {
                if ((current.getSpeed() >= MIN_SPEED) && (current.getSpeed() <= MAX_SPEED)) {
                    justPlanes.add(current);
                }
            }
        }

        return justPlanes;

    }

    /**
     * Get vehicle with max speed
     * */
    public static String getMaxSpeedVehicle (ArrayList<Vehicles> vehiclesList){
        int maxSpeed = 0;
        for (Vehicles curr : vehiclesList){
            if (curr.getSpeed()>=maxSpeed){
                maxSpeed = curr.getSpeed();
            }
        }
        for ( Vehicles curr : vehiclesList){
            if (curr.getSpeed() != maxSpeed){
                vehiclesList.remove(curr);
            }
        }
        return vehiclesList.toString();
    }
    /**
     * Get vehicle with min price and max speed
     * */
    public static String getVehiclesInOrder (ArrayList<Vehicles> vehiclesList){
        SortingVehiclesByPriceSpeed sort = new SortingVehiclesByPriceSpeed();
        String buffer  = sort.sortVehiclesByPriceSpeed(vehiclesList).toString();
        return buffer;
    }
    /**
     * Sort by abilities into according lists
     * */
    public static ListByAbility getFilteredByWaysOfMoving(List<Vehicles> vehicles) {
        ListByAbility filteredResult = new ListByAbility();
        for(Vehicles v: vehicles) {
            if(v instanceof Rideable) {
                filteredResult.moveAbles.add(v);
            }
            if(v instanceof Swimable) {
                filteredResult.swimAbles.add(v);
            }
            if(v instanceof Flyable) {
                filteredResult.flyAbles.add(v);
            }
        }
        return filteredResult;
    }


}
