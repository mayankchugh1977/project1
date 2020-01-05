package algo.module.one;


import java.util.Scanner;
class SumClass{
    public static int sum(int n){

        if (n != 0)
            return n + sum(n - 1);
        else
            return n;
        //write the logic here

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = SumClass.sum(n);
            System.out.print(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}