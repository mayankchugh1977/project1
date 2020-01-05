package binary.com.upgrad.spiral.traverse;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i) {
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in the spiral order
    void spiralOrder() {
        // Write your code here
        if (root == null)
            return;

        Stack<Integer> s = new Stack<Integer>();
        Queue<Node> q = new LinkedList<Node>();

        boolean reverse = true;
        q.add(root);
        while (!q.isEmpty())
        {
            int size = q.size();
            while (size > 0)
            {
                Node p = q.peek();
                q.remove();

                // if reverse is true, push node's
                // data onto the stack, else print it
                if (reverse)
                    s.add(p.data);
                else
                    System.out.print(p.data + " ");

                if (p.left != null)
                    q.add(p.left);
                if (p.right != null)
                    q.add(p.right);
                size--;
            }

            // print nodes from the stack if
            // reverse is true
            if (reverse)
            {
                while (!s.empty())
                {
                    System.out.print(s.peek() + " ");
                    s.pop();
                }
            }

            // the next row has to be printed as
            // it is, hence change the value of
            // reverse
            reverse = !reverse;
        }
    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
class SpiralLevelOrderTraversal {
    public static void main(String[] x) {
        Tree tree = new Tree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.spiralOrder();
        }
    }
}