package fun.com;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNumberMeanTest {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("D:\\my doc\\upgrad\\quiz_numbers.txt"); // Specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int numb = 1;
        int sum = 0;

        //Reading each line of file using Scanner class
        int lineNumber = 0;  // keep track of line number

        while (scan.hasNext()) {  // read the numbers and add them to the value of the sum
            int number = scan.nextInt();
            sum = sum + number;

            lineNumber++;
        }
        System.out.println("lineNumber is : " + lineNumber);
        System.out.println("sum is : " + sum);
        System.out.println("Means is : " + (double)sum/lineNumber);
    }
}
