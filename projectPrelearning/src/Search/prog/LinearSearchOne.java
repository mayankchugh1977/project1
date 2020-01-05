package Search.prog;

import java.util.Scanner;
class LinearSearchOne{
    public static void main(String args[]){
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
        //write your code here
//        7
//        6 8 3 5 9 1 2
//        9
        index = 0;
        for (i = count - 1 ; i >= 0 ; i--) {

            if(array[i] == key ){
                System.out.println(index);
                break;
            }
            index = index + 1;

        }
    }
}