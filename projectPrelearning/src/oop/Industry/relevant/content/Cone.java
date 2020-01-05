package oop.Industry.relevant.content;

class Shape2 {
    double radius = 5.16;
    double length = 6.99;
    double breadth = 8.10;

    void dimensions() {
        System.out.println(breadth);
    }
}

public class Cone extends Shape2 {
    double radius = 7.77;

    void dimensions() {
        System.out.println(length);
    }

    public static void main(String args[]) {
        Shape2 b = new Cone();
        b.dimensions();
        System.out.println(b.radius);
    }
}