package oop.encapsulation;

class Display {
    public Display(int i) {
        System.out.println("ONE");
    }

    public Display() {
        this(1);

        System.out.println("TWO");
    }

    void Display() {
        Display(1);

        System.out.println("THREE");
    }

    void Display(int i) {
        System.out.println("FOUR");
    }
}

public class DisplayTest {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.Display();
    }
}