package Search.sort;

import java.util.Scanner;

class GradedTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Write your code here
//        5
//        2 7 8 6 13
//        4
//        15 11 9 5
        int element = 0;
        int elementIndex = 0;
        int elementBefore = 0;
        int elementAfter = 0;
        for (int i = 0; i < n1; i++) {

            if(i > 0 && i < n1){
                if(array1[i] < array1[i - 1]){
                    element = array1[i];
                    elementIndex = i;
                    elementBefore = array1[i - 1];
                    if(i < n1){
                        elementAfter = array1[i + 1];
                    }

                    break;
                }
            }
        }

        int finalElement = -1;
        for (int j = 0; j < n2; j++) {

            if(array2[j] > element && array2[j] > elementBefore && array2[j] < elementAfter ){
                if(finalElement == -1) {
                    finalElement = array2[j];
                }
            }

        }

        if(finalElement == -1) {
            System.out.println("Not Possible");
        }else
        {
            System.out.println(finalElement);
        }
    }
}
