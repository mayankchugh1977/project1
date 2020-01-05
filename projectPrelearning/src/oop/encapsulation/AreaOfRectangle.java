package oop.encapsulation;

import java.util.Scanner;

class Rectangle
{
    int length;
    int breadth;
    //method to intialize length and breadth of rectangle
    void setData(int l, int b)
    {
        this.length =l;
        this.breadth=b;
    }
    //method to calculate area of rectangle
    int areaOfRectangle()
    {
        int rectArea;
        rectArea = this.length * this.breadth;
        return rectArea;
    }
}
//Class to Create Rectangle Objects and Calculate Area
public class AreaOfRectangle
{
    public static void main(String[] args)
    {

        //Creating objects
        Rectangle rectObj = new Rectangle();

        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        int length = in.nextInt();
        int breadth = in.nextInt();

        rectObj.setData(length,breadth);
        int result = rectObj.areaOfRectangle();
        System.out.println("Area of Rectangle = "+ result);
    }
}