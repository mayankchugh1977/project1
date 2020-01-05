package prelearning;

import java.util.*;
public class ArraysTest1 {

    public static void main(String[] args) {

        int studentMarks[] = new int[5];
        Scanner input= new Scanner(System.in);
        studentMarks[0] = input.nextInt();
        studentMarks[1] = input.nextInt();
        studentMarks[2] = input.nextInt();
        studentMarks[3] = input.nextInt();
        studentMarks[4] = input.nextInt();


        System.out.println(studentMarks[4]);
    }
}