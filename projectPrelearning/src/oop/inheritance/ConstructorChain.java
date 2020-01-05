package oop.inheritance;

class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square extends Rectangle {
    public Square() {
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        Square sq = new Square();
    }
}