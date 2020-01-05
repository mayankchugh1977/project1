package performace;

import java.util.*;

public class LinkedListInsertNodeInLast {
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
        int k = s.nextInt();
        addAtEnd(k);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the end of the list
    static void addAtEnd(int k) {
        /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(k);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null)
        {
            head = new Node(k);
            return;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
}
