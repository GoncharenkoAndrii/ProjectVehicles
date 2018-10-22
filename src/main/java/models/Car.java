package models;

public class Car extends Vehicles implements Rideable {
    String name;

    public Car(int price, int yearOfProduction, int speed, String name) {
        super(price, yearOfProduction, speed);
        this.name = name;
        NUMBER_OF_PRODUCTION++;
    }

    @Override
    public String toString() {
        return "models.Car{" +
                "price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", speed=" + speed +
                '}';
    }

    /**
     * Equals and hashtag block
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
        char[] arr = (name + "car").toCharArray();
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
