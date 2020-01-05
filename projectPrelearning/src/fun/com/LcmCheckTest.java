package fun.com;

import java.util.Scanner;

class LcmCheckTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }

    // Write the LCM function here


    static int lcm(int n1,int n2)
    {
        int temp,i=2,res;
        if(n1>n2)
            res=n1;
        else
            res=n2;
        temp=res;
        while(res%n1!=0 || res%n2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;

    }
}