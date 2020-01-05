package oop.inheritance;

class Coffee
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}

public class tea
{
    public static void main(String args[])
    {
        Coffee c = new Coffee();
        c.order();
    }
}