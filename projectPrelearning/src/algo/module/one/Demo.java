//check for demo

package algo.module.one;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int n, req_no, flag = 0, i;
        Scanner s = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        n = a.length;
        System.out.println("There are numbers from 0 to 9");
        System.out.print("So, Enter the element you want to find:");

        // taking the required number from the user
        req_no = s.nextInt();

        //Searching in the array for required number
        for (i = 0; i < n; i++) {
            //If required number is found
            if (a[i] == req_no) {
                flag = 1;
                break;
            }
            //If required number is not found
            else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("Entered number found at position:" + (i + 1));
        } else {
            System.out.println("Sorry! Entered number not found");
        }
    }
}