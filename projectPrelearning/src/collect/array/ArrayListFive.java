package collect.array;

import java.util.ArrayList;

public class ArrayListFive {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        random.remove(3);
        random.add(3,15f);
       // System.out.println(random.contains(5f));
        printList(random);
    }

    public static void printList(ArrayList<Float> arr) {
        for(Float num : arr) {
            System.out.println(num);
        }
    }


}


/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
