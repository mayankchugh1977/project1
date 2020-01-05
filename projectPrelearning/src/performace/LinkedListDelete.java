package performace;

import java.util.*;

public class LinkedListDelete {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        deleteLastNode();

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the first node of the LinkedList
    static void deleteLastNode() {
        // Write your code here
        if (head == null)
            return ;

        if (head.next == null) {
            head = null;
//            head.data = 0;
//            head.next = null;
            return ;
        }

        if (head.next != null &&  head.next.next == null) {
            head = null;
//            head.data = 0;
//            head.next = null;
            return ;
        }else {

            // Find the second last node
            Node second_last = head;
            while (second_last.next.next != null)
                second_last = second_last.next;

            // Change next of second last
            second_last.next = null;

            return;
        }
    }
}
