package comparators;

import models.Vehicles;

import java.util.Comparator;

public class VehiclePriceComparator implements Comparator<Vehicles> {


    public int compare(Vehicles o1, Vehicles o2) {
        if (o1.getPrice()>=o2.getPrice()){return 1;}
        else if (o1.getPrice() == o2.getPrice()){return 0;}
        else {return -1;}
    }

    public Comparator<Vehicles> thenComparing(final Comparator<? super Vehicles> other) {
        Comparator<Vehicles> v = new InnerComparator(other);
        return  v;
    }

    private class InnerComparator implements Comparator<Vehicles> {
        private Comparator<? super Vehicles> other;

        public InnerComparator(Comparator<? super Vehicles> other){
            this.other = other;
        }

        public int compare(Vehicles o1, Vehicles o2) {
            int res = compare(o1, o2);
            return (res != 0) ? res : other.compare(o1, o2);
        }
    }
}
