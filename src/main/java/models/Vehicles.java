package models;

public abstract class Vehicles implements Comparable<Vehicles>{

    protected int price;
    protected int yearOfProduction;
    protected int speed;

    protected static int NUMBER_OF_PRODUCTION = 0;

    /**
     * Telescopic constructor pattern
     */
    public Vehicles(int price, int yearOfProduction, int speed) {
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.speed = speed;
    }

    public Vehicles(int price, int yearOfProduction) {
        this(price, yearOfProduction, 0);
    }

    public Vehicles(int price) {
        this(price, 0);
    }

    public Vehicles() {
        this(0);
    }

    /**
     * Getter block
     */
    public int getPrice() {
        return price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getSpeed() {
        return speed;
    }


    /**
     * ToString
     */
    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", speed=" + speed +
                '}';
    }
    public int compareTo (Vehicles other){
        Integer price = this.getPrice();
        return price.compareTo(other.getPrice());
    }


}
