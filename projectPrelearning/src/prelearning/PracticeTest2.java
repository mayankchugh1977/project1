package prelearning;

import java.util.*;
public class PracticeTest2 {

    public static void main(String[] args) {

        int length,breadth;
        Scanner input = new Scanner(System.in);
        length=input.nextInt();
        breadth=input.nextInt();
        if (length==breadth){
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
