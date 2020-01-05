package performace;

import java.util.*;

public class LinkedListFindandElement {
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
        System.out.println(search(k));
    }

    // Method to search for k in the given LinkedList
    static boolean search(int k) {
        // Write your code here
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            return false;
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.data == k) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            return true;
        else
            return false;

    }
}
