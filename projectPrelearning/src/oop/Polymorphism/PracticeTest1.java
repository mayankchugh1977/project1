package oop.Polymorphism;

interface SwordFighter {
    public static final String maxSwordsWielded = "2";

    public void attack();
    public void escape();
    public void showWeapon();

}

// Write your implementation for the SwordFighter interface here

class Knight implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    // please write the showWeapon() method for the Knight class here.
    // It should print out "Shows Sword" in a new line
    @Override
    public void showWeapon() {
        System.out.println("Shows Sword");
    }
}

class Ninja implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    public void showWeapon() {
        System.out.println("Shows Katana");
    }
    // please write the showWeapon() method for the Ninja class here.
    // It should print out "Shows Katana" in a new line
}

public class PracticeTest1 {
    public static void main(String[] args) {
        //Interface prelearning.variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);

        Knight knight = new Knight();
        Ninja ninja = new Ninja();

        knight.showWeapon();
        ninja.showWeapon();

        knight.attack();
        ninja.attack();

        knight.escape();
        ninja.escape();
    }

}