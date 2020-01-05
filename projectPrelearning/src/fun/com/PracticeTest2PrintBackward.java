package fun.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeTest2PrintBackward {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        PracticeTest2PrintBackward obj = new PracticeTest2PrintBackward();
        obj.printBackwards(numbers);
    }

    public void printBackwards(int[] numbers) {
        for(int i=numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

