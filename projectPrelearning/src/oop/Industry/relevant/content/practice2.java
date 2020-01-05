package oop.Industry.relevant.content;


class First {
    static void display() {
        System.out.println("ONE");
    }
}

class Second extends First {
    static void display() {
        System.out.println("TWO");
    }
}

public class practice2 {
    public static void main(String[] args) {
        First obj = new Second();

        obj.display();
    }
}