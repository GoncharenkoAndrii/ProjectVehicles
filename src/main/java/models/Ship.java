package models;

public class Ship extends Vehicles implements Swimable {

    private String name;
    private final String NAME_MODIFICATOR_FOR_SHIPS = "S";
    private String portOfService;
    private int passengersCapasity;
    private int price;
    private int yearOfProduction;
    private int speed;


    public static class Builder {
        /**
         * required parameters
         */
        private int price;
        private int yearOfProduction;
        private int speed;
        /**
         * optional parameters
         */
        private String name = "";
        private String portOfService = "none";
        private int passengersCapacity = 0;

        /**
         * Constructor
         */
        public Builder(int priceLoc, int yearLoc, int speedLoc) {
            this.price = priceLoc;
            this.yearOfProduction = yearLoc;
            this.speed = speedLoc;
        }

        public Builder name(String nameVal) {
            name = nameVal;
            return this;
        }

        public Builder portOfService(String portVal) {
            portOfService = portVal;
            return this;
        }

        public Builder passengersCapacity(int passVal) {
            passengersCapacity = passVal;
            return this;
        }

        public Ship build() {
            return new Ship(this);
        }


    }

    private Ship(Builder shipBuilder) {
        //
        NUMBER_OF_PRODUCTION++ ;
        price = shipBuilder.price;
        yearOfProduction = shipBuilder.yearOfProduction;
        speed = shipBuilder.speed;
        //
        name = shipBuilder.name;
        yearOfProduction = shipBuilder.yearOfProduction;
        passengersCapasity = shipBuilder.passengersCapacity;
    }


    /**
     * ToString
     */
    @Override
    public String toString() {
        return "models.Ship{" +
                "name='" + name + '\'' +
                ", portOfService='" + portOfService + '\'' +
                ", passengersCapasity=" + passengersCapasity +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", speed=" + speed +
                '}';
    }

    /**
     * Getters
     */
    public String getName() {
        return name;
    }

    public String getPortOfService() {
        return portOfService;
    }

    public int getPassengersCapasity() {
        return passengersCapasity;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    /**
     * Equals and hashcode operations
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

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        char[] arr = (name + portOfService + "ship").toCharArray();
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

}
