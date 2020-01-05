package oop.encapsulation;

public class GetterMethod{
    public static void main(String[] a) {
        CircleClass c1 = new CircleClass(10f);
        printCircle(c1);
    }

    public static void printCircle(CircleClass c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class CircleClass{
    private float radius;
    public static final float PI = 3.1414f;

    public CircleClass(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





