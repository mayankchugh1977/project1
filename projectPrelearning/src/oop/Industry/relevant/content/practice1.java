package oop.Industry.relevant.content;


abstract class A {
    abstract int methodA(int k);

    abstract int methodB(int i);

    int methodC(int i) {
        return methodB(++i);
    }
}

class B extends A {
    @Override
    int methodA(int k) {
        return 0;
    }

    int methodB(int i) {
        return ++i;
    }
}

public class practice1 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.methodB(10));
    }
}