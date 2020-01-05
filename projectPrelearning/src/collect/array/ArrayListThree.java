package collect.array;

import java.util.ArrayList;

class ArrayListThree {

    public static void main(String[] args) {

        ArrayList<Double> random = new ArrayList<Double> ();

        random.add(2.0);
        random.add(4.0);
        random.add(5.0);
        random.add(10.0);
        random.add(99.9);
        //Create an ArrayList using Generics here

        printArray(random);
    }

    public static void printArray(ArrayList<Double> random) {
        for(Double randomObj : random){
            System.out.println(randomObj);
        }
        //Complete the method declaration here
    }
}
