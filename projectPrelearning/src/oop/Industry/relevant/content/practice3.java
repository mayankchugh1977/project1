package oop.Industry.relevant.content;

interface first {
    default public void display() {
        System.out.println("This is the display function of method1");
    }
}

interface second {
    default public void display() {
        System.out.println("This is the display function of method2");
    }
}

public class practice3 implements first, second {
    public static void main(String[] args) {
        practice3 object = new practice3();
        object.display();
    }

    @Override
    public void display() {

    }
}