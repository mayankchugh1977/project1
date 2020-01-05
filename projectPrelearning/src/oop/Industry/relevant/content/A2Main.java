package oop.Industry.relevant.content;


class A2 {
    public void display() {
        double i = 99.99;
        System.out.println(i);
    }
}
class B2 extends A2 {
    public void display() {
        double i = 100;
        super.display();
    }
}
public class A2Main {
    public static void main(String[] args) {
        B2 object = new B2();
        object.display();
    }
}