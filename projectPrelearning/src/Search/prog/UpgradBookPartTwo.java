package Search.prog;

import java.util.Scanner;

public class UpgradBookPartTwo {
    public int getSearchElementAndIndex(int[] inputArr, int size, int key) {
        // Write your code here

        int start = 0;
        int retIndex = 0;

        try {
            while (start < size) {


                if (key == inputArr[start]) {
                    retIndex = start + 1;
                    return retIndex;
                }
                start++;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        return retIndex;
    }

//    Input :
//            10 -  This corresponds to the size of the array.
//            6 -  This corresponds to the key you are searching for
//            1 2 3 5 6 7 8 9 10 11 - These are the elements of the array
//    Output :
//            5 - Output should be the index at which the key is present. In this case, key 6 is present at index 5 of 1-INDEXED array. So the output is 5.
//    Input:
//            20
//            20
//            1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
//    Output :
//            19

    public static void main(String args[] ) throws Exception {
        UpgradBookPartTwo upgradBook = new UpgradBookPartTwo();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int key = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int retIndex  = upgradBook.getSearchElementAndIndex(array,size , key);

        if(retIndex == 0)
            System.out.println("NOT_FOUND");
        else{
            System.out.println(retIndex);
        }
    }
}

