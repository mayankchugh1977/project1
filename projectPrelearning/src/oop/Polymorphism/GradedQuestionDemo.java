package oop.Polymorphism;

public class GradedQuestionDemo {
    public static void main(String[] args) {
        Square3 mySquare = new Square3(5.0);

        mySquare.myMethod(10);
    }
}

class Rectangle3 {
    private String type;

    public Rectangle3(double width, double height) {
      //  this.width = width;
      //  this.height = height;
    }

    public void myMethod(int someVariable){
    //...
    }
}

class Square3 extends Rectangle3 {
    public Square3(double side) {
        super(side, side);
    }

    public void myMethod(int someVariable){
   // ...
    }
}
