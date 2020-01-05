package oop.encapsulation;

abstract class HomeLoan1 {
    public HomeLoan1() {
        System.out.println("House 1");
    }

    abstract void numbers();
}

class Bank3 extends HomeLoan1 {
    public Bank3() {
        System.out.println("Bank1");
    }

    void numbers() {
        System.out.println("Rate of interest is 7.2");
    }
}

public class HomeLoanTestOne {
    public static void main(String[] args) {
        HomeLoan1 obj = new Bank3();
        obj.numbers();
    }
}