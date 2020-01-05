package algo.module.one;


import java.util.*;

public class PeopleMeet {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        twoPeopleMeet(p1, p2, s1, s2);
    }

    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        int p = 0;

        if(p1 >= p2){
            p = p1 -p2;
        }else {
            p = p2 -p1;
        }

        int s = 0;

        if(s1 >= s2){
            s = s1 -s2;
        }else {
            s = s2 -s1;
        }
        System.out.println(p);
        System.out.println(s);

        int finalSteps = p/s;
        System.out.println(finalSteps);
        if(finalSteps == s1 || finalSteps == s2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}