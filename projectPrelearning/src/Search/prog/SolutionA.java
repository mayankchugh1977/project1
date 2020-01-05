package Search.prog;

import java.util.Scanner;

public class SolutionA {
    public int getSearchElementAndIndex(int[] inputArr, int size) {
        // Write your code here

        int start = 0;
        int retIndex = 0;

        while (start < size) {

            if ((start + 1) == inputArr[start]) {
                retIndex = start + 1;
                return retIndex;
            }
            start++;
        }

        return retIndex;
    }

//    Sample Input:
//            5
//            0 1 3 4 5
//    Sample Output:
//            3

//    Input :
//            7
//            0 1 2 4 5 6 7
//    Output :
//            4

    public static void main(String args[] ) throws Exception {
        SolutionA upgradBook = new SolutionA();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int retIndex  = upgradBook.getSearchElementAndIndex(array, size);

        if(retIndex == 0)
            System.out.println("NOT_FOUND");
        else{
            System.out.println(retIndex);
        }
    }
}

