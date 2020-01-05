package oop.encapsulation;

import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }
    //Write your code here.

    int getSuitPriority(String suitString) {

        //Write your code here.
        int suitPriority = 0;

        switch(suitString) {
            case "clubs":
                suitPriority = 1;
                break;
            case "hearts":
                suitPriority = 2;
                break;
            case "diamonds":
                suitPriority = 3;
                break;
            case "spades":
                suitPriority = 4;
                break;
            default:
                suitPriority = 0;
        }

        return suitPriority;
    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        if(c1.getValue() > c2.getValue()){
            points1 = 1;
        }else  if(c1.getValue() == c2.getValue()){
            if(c1.getSuitPriority(c1.getSuit()) > c2.getSuitPriority(c2.getSuit())){
                points1 = 1;
            }else if(c1.getSuitPriority(c1.getSuit()) < c2.getSuitPriority(c2.getSuit())){
                points2 = 1;
            }
        }else{
            points2 = 1;
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class CardGameSource {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}