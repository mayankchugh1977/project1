package oop.Industry.relevant.content;

import java.util.*;

//Write your code here
class Shape{
    int numberOfSides;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void display(){
        if(this.numberOfSides == 0) {
            System.out.println("The shape is a circle");
        }else if(this.numberOfSides == 3) {
            System.out.println("The shape is a triangle");
        }else if(this.numberOfSides == 4) {
            System.out.println("The shape is a rectangle");
        }else {
            System.out.println("Enter a valid number of sides!");
        }
    }
}

class Triangle extends Shape {
    public void display(){
        super.display();
    }
}

class Rectangle extends Shape {
    public void display(){
    super.display();
    }
}

public class PracticeTest4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();
        obj.setNumberOfSides(numberOfSides);
        obj.display();
    }
}