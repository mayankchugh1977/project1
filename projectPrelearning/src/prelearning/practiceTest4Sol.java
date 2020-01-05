package prelearning;

import java.util.*;
public class practiceTest4Sol {

    public static void main(String[] args) {

        int age, vote;
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        vote=input.nextInt();
        if (age>=18){
            if (vote==1)
                System.out.println("You have voted for Ram");
            if (vote==2)
                System.out.println("You have voted for Shyam");
            if (vote==3)
                System.out.println("You have voted for Ghanshyam");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}
