package Search.prog;

import java.util.Scanner;

public class LinearSearchThree {

    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int n = inputArr.length;
        for(int i = 0; i < n; i++)
        {
            if(inputArr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        LinearSearchThree obj = new LinearSearchThree();

        Scanner input = new Scanner(System.in);
        int[] array;
        int i, index;
        //Declare the array here

        int count = input.nextInt();
        array = new int[count];
        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();

        int result = obj.getLinearSearchUnsuccessfulComparisonCount(array, key);
        if(result == -1)
            System.out.print((array.length));
        else
            System.out.print(result);
    }
}

