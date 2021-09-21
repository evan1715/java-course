package wk5;

//Exercise 87: Apartment comparison

public class Apartment {
    //private int rooms;
    private int sqMeters, pricePerSqMeter;

    public Apartment(int rooms, int sqMeters, int pricePerSqMeter) {
        //this.rooms = rooms;
        this.sqMeters = sqMeters;
        this.pricePerSqMeter = pricePerSqMeter;
    }

    //Exercise 87.1: Larger
    public boolean larger(Apartment otherApt) {
        return this.sqMeters>otherApt.sqMeters;
    }

    //Exercise 87.2: Price Difference
    public int priceDifference(Apartment otherApt) {
        //Return the absolute value of the price difference
        int priceDifference = (this.sqMeters*this.pricePerSqMeter)-(otherApt.sqMeters*otherApt.pricePerSqMeter);
        if (priceDifference < 0) {
            priceDifference *= -1;
        }
        return priceDifference;
    }

    //Exercise 87.3: More expensive than
    public boolean costsMoreThan(Apartment otherApt) {
        return (this.sqMeters*this.pricePerSqMeter)>(otherApt.sqMeters*otherApt.pricePerSqMeter);
    }


}