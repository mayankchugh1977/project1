package performace;

import java.util.*;

public class LinkedListDeleteIndex {
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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        // Write your code here
        Node current = head;
        Node parent = null;
        int position = 0;

        while (current != null && index - 1 > position) {
            parent = current;
            current = current.next;

            position++;
        }

        if (current != null && parent == null) {
            // Delete head.
            if (current.next != null) {
                // Move head to next value.
                head = current.next;
            }
            else {
                // Just set the head to null.
                head = null;
            }
        }
        else if (current != null) {
            // Delete current, link parent to child..
            parent.next = current.next;
        }

        return ;
    }
}
