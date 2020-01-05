package Search.prog;

import java.util.*;
class Source {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here

        int start = 0;
        int end = inputArr.length - 1;
        int count = 0;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (key < inputArr[middle]) {
                end = middle - 1;
            }else if (key > inputArr[middle]) {
                start = middle + 1;
            }else if  (key == inputArr[middle]) {
                return count;
            }
            count++;
        }
        return -1;
    }

//    Sample Input:
//            5
//            2 3 4 5 8
//            8
//
//    Sample Output:
//            2

    public static void main(String args[] ) throws Exception {
        Source bs = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
