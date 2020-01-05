package oop.encapsulation;

import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public Homeloan(double amount, int time) {
      this.amount = amount;
        this.time = time;
    }

    public abstract double simpleInterest();
}

class Bank1 extends Homeloan {

    public Bank1(double amount, int time) {
        super(amount,time);
    }

    double getRateOfIntererst(){
        return  7.2;
    }
    //Write your code here

    public double simpleInterest() {

        double simpleInterset;

        simpleInterset = (this.amount * this.getRateOfIntererst() * this.time) / 100;
        return this.amount + simpleInterset;
    }

}

class Bank2 extends Homeloan {

    public Bank2(double amount,  int time) {
        super(amount,time);
    }

    double getRateOfIntererst(){
        return  8.1;
    }


    public double simpleInterest() {

        double simpleInterset;

        simpleInterset = (this.amount * this.getRateOfIntererst() * this.time) / 100;

        return this.amount + simpleInterset;
    }

}

class HomeLoanTest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (amount <= 0 || time <= 0) {
            System.out.println("invalid input");
        }else {
            if (obj1.simpleInterest() < obj2.simpleInterest()) {
                System.out.println("File for a loan in Bank1");
                System.out.println(obj1.simpleInterest());
            } else {
                System.out.println("File for a loan in Bank2");
                System.out.println(obj2.simpleInterest());
            }
        }
    }

}