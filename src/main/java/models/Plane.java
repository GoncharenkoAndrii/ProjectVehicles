package models;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.FileHandler;

public class Plane extends Vehicles implements Flyable {

    public static final Logger plannerLogger = Logger.getLogger(Plane.class.getName());

    static {
        try {
            LogManager.getLogManager().readConfiguration(
                    Plane.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
    }


    /**
     * Optional prameters for plane
     */
    private String name;
    private int maxHeight;
    private int passengersCapasity;


    public Plane(int price, int yearOfProduction, int speed, String name) {

        super(price, yearOfProduction, speed);
        this.name = name;
        NUMBER_OF_PRODUCTION++;
    }

    /**
     * Getters/setters block
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getPassengersCapasity() {
        return passengersCapasity;
    }

    public void setPassengersCapasity(int passengersCapasity) {
        this.passengersCapasity = passengersCapasity;
    }

    /**
     * ToString method
     */
    @Override
    public String toString() {
        return "models.Plane{" +
                "name='" + name + '\'' +
                ", maxHeight=" + maxHeight +
                ", passengersCapasity=" + passengersCapasity +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", speed=" + speed +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        if (this.getPrice() != ((Plane) obj).getPrice())
            return false;
        if (this.getPassengersCapasity() != ((Plane) obj).getPassengersCapasity())
            return false;
        if (this.getYearOfProduction() != ((Plane) obj).getYearOfProduction())
            return false;
        if (this.getSpeed() != ((Plane) obj).getSpeed())
            return false;
        if (this.getMaxHeight() != ((Plane) obj).getMaxHeight())
            return false;


        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        char[] arr = (name + "plane").toCharArray();
        int varA = 1;
        int varB = 1;

        for (int counter = 0; counter < arr.length; counter++) {
            if (counter % 2 == 0) varA = varA + (int) arr[counter];
            if (counter % 2 == 1) varB = varB + (int) arr[counter];

        }
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    public static void main(String[] args) {
        plannerLogger.log(Level.INFO,"LOG about noyhing");
    }


}
