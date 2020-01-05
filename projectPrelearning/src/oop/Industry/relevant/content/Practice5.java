package oop.Industry.relevant.content;

class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class Practice5 extends Base implements BaseInterface {

    public static void main(String[] args) {

        Practice5 obj = new Practice5();
        obj.display();
    }
}