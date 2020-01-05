import java.util.Scanner;

public class CompareFunction {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 27;
        String compareResult = compare(num1, num2);  // pass prelearning.variables to be compared
        System.out.print(compareResult);

        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));

    }

    public static String compare(int var1, int var2) {

        String result;
        if (var1 > var2) {
            result = var1 + " is larger than " + var2;
        } else if (var1 == var2) {
            result = "Both numbers are equal";
        } else {
            result = var2 + " is larger than " + var1;
        }
        return result;
    }

    public static int squareOfSum(int number1, int number2) {

        int result;

        result = (int) Math.pow(number1+number2,2);

        return result;
    }

    public static int squareOfSum2(int x, int y){
        return (x + y) * (x + y);
    }
}


