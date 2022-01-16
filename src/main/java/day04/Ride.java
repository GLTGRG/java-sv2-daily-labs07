package day04;

public class Ride {

    private int day;
    private int numberOfRide;
    private int kms;

    public Ride(int day, int numberOfRide, int kms) {
        this.day = day;
        this.numberOfRide = numberOfRide;
        this.kms = kms;
    }

    public boolean isBefore(Ride anotherRide){
        if(day > anotherRide.getDay()){
            return false;
        }
        if (day == anotherRide.getDay() && numberOfRide > anotherRide.getNumberOfRide()){
            return false;
        }
        return true;
    }

    public int getDay() {
        return day;
    }

    public int getNumberOfRide() {
        return numberOfRide;
    }

    public int getKms() {
        return kms;
    }
}


