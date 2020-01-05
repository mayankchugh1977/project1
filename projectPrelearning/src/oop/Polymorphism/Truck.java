package oop.Polymorphism;

abstract class Vehicle {
    private char vehicleType;
    public abstract void move ();
}

public class Truck extends Vehicle {
    private int truckNo;


    public static void main(String args[]) {
        Truck mahindra= new Truck();
        mahindra.move();
    }

    @Override
    public void move() {

    }
}