package oop.encapsulation;

import java.util.*;


class SavingAmount {
    int initialSaving;

    public void setInitialSaving(int initialSaving) {
        this.initialSaving = initialSaving;
    }

    public int getInitialSaving() {
        return this.initialSaving ;
    }

    public void decrementSaving() {
        this.initialSaving = this.initialSaving - 100;
    }

    public void incrementSaving() {
        this.initialSaving = this.initialSaving + 1000;
    }

    public void checkSaving() {
        if( this.initialSaving >= 1000){
            System.out.println("Congratulations! You have saved a good amount");
        }else  if( this.initialSaving >= 0 && this.initialSaving < 1000){
            System.out.println("Insufficient saving!");
        }else if( this.initialSaving < 0){
            System.out.println("You are in debt");
        }
    }

    public int getCurrentSaving() {
        return this.initialSaving ;
    }

//write your code here
}

public class BankAccountSavingAmount {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}