package collect.array;

import java.util.ArrayList;                  //ArrayList library imported

class ArrayListTestTwo {
    public static void main(String[] args) {
//        int random[ ] = {2, 4, 5, 10};
        //Declare and create an object of the ArrayList class named 'random', in place of the line above
        ArrayList random = new ArrayList();

        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);
        //Add the first four elements to this 'random' ArrayList

        random.add(99);                    //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList arr) {//int[] arr) {   //Change the type of the parameter to ArrayList
//        for(int a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
//            System.out.println(a);
//        }
        for(Object a : arr){
            int randomObj = (int)a;
            System.out.println(randomObj);
        }
    }
}