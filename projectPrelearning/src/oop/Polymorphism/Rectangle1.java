package oop.Polymorphism;

public class Rectangle1 {
    private double width;
    private double height;

    Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +  (width * height) ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }
}


/*
class Square extends Rectangle {

    private double length;

    Square(double length) {
        super(length, length);
    }

    @Override
    public void area() {
        System.out.println("Area of Square is: " +  (2 * length) ) ;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Square is: " + ( (4* length) ) ) ;
    }
}
*/

class Square1 extends Rectangle1 {
            Square1(double side) {
            super(side, side);
            }

    public void area() {
        System.out.println("Area of Square is: " + (super.getWidth() * super.getWidth()) ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Square is: " + ( 4 * super.getWidth()));
    }
}

