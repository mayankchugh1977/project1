package performace;

import java.util.*;

public class LinkedListInsertNodeAtNth {
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
        int index = s.nextInt();
        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    static void addAtGivenIndex(int k, int index) {
        // Write your code here
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of
        // the linked list
        if (len < index) {
            Node new_node = new Node(k);
            new_node.next = null;

            Node last = head;
            while (last.next != null)
                last = last.next;

            last.next = new_node;
            return;

        }
        temp = head;

        for (int i = 1; i < len - index - 1; i++)
            temp = temp.next;

        Node new_node = new Node(k);
        new_node.next = temp.next;
        temp.next = new_node;
        return;
    }
}
