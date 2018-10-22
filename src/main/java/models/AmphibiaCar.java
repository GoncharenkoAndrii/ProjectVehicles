package models;

public class AmphibiaCar extends Car implements Swimable {

    public AmphibiaCar(int price, int yearOfProduction, int speed, String name) {
        super(price, yearOfProduction, speed, name);
        NUMBER_OF_PRODUCTION++;
    }

    @Override
    public String toString() {
        return "models.AmphibiaCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", speed=" + speed +
                '}';
    }
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
