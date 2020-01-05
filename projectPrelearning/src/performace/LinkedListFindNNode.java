package performace;

import java.util.*;

public class LinkedListFindNNode {
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
        kthNodeFromEnd(k);
    }

    // Method to find kth element from the end in the LinkedList
    static void kthNodeFromEnd(int k) {
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
        if (len < k) {
            System.out.println("Not Possible");
            return;
        }
        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - k + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);

    }
}