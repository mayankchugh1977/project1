package prelearning;


import java.util.Scanner;
class userinput3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value for a");
        a = input.nextInt();
        System.out.println("Enter the value for b");
        b = input.nextInt();
        System.out.println("Enter the value for c");
        c = input.nextInt();
        System.out.println("a*b+c : "+(a*b+c));
        //Write your code here
        //You can import the scanner class as discussed in the videos
    }
}
