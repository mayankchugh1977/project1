package oop.encapsulation;

public class ClassesAndObjectsTwo {
    public static void main(String[] args) {
        Ball obj = new Ball();
        obj.spinAndBounce();
//        Ball.spinAndBounce();
    }
}

class Ball {
    public String state;


    public void bounce() {
        state = "bouncing";
        System.out.println("Ball is bouncing");
    }

    public  void spin() {
        state = "spinning";
        System.out.println("Ball is spinning");
    }

    public  void spinAndBounce() {
        spin();
        bounce();
    }
}