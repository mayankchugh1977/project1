package oop.Polymorphism;


abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set(int a);

   // abstract final public void get();

}

class AbstractDemo extends demo
{

    public void set(int a)
    {
        this.a = a;
    }

    /*final public void get()
    {
        System.out.println("a = " + a);
    }*/

    public static void main(String[] args)
    {
        AbstractDemo obj = new AbstractDemo();
        obj.set(2);
        //obj.get();
    }
}