package binary.com.upgrad.merge.sorted.linked.list;

import java.util.*;

//class representing Structure of node in the linked list
class Node {
    int data;
    Node next;
};

class MergeKSortedLinkedList {

    //creates a new node with the given 'data' and returns that node
    Node newNode (int data) {

        Node newNode = new Node();

        newNode.data = data;
        newNode.next = null;

        return newNode;
    }

    // Driver program to test above
    public static void main(String args[]) {

        //array list whose each element is the head of each linked list
        ArrayList<Node> arr = new ArrayList<>();
        MergeKSortedLinkedList obj = new MergeKSortedLinkedList();

        Scanner in = new Scanner(System.in);

        // Number of linked lists
        int k = in.nextInt();

        // Number of elements in each linked list
        int n = in.nextInt();

        Node tmp = null;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {

                //head node of the linked list
                if (j == 0) {
                    int dt = in.nextInt();
                    arr.add(obj.newNode (dt));
                } else {
                    int dt = in.nextInt();
                    tmp = arr.get(i);
                    for (int m = 1; m < j; m++) {
                        tmp = tmp.next;
                    }
                    tmp.next = obj.newNode (dt);
                }
            }
        }

        //write your code here

        for (int i = 0; i < k; i++) {
            System.out.println("i : "+ i+" --> "+(arr.get(i)).data);
            for (int j = 0; j < n; j++) {

                System.out.println("j : "+ j+" --> "+(arr.get(j)).next.data);
                System.out.println("j : "+ j+" --> "+(arr.get(j)).next.next.data);
                System.out.println("j : "+ j+" --> "+(arr.get(j)).next.next.next.data);


            }
        }


        //PriorityQueue is heap in Java
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        int total=0;

        //add arrays to heap
        for (int i = 0; i < arr.size(); i++) {
            queue.add(arr.get(i));
        }

        int m=0;
        int result[] = new int[total];

        //while heap is not empty
//        while(!queue.isEmpty()){
//            ArrayContainer ac = queue.poll();
//            result[m++]=ac.arr[ac.index];
//
//            if(ac.index < ac.arr.length-1){
//                queue.add(new ArrayContainer(ac.arr, ac.index+1));
//            }
//        }

        System.out.println(Arrays.toString(result));

    }

}

