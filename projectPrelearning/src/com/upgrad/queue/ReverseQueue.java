package com.upgrad.queue;

    import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
    import java.util.Stack;

class ReverseQueue{
        static Queue<Integer> q = new LinkedList<Integer>();

        public static void func() {
            //write your code here
            Stack<Integer> stkone = new Stack<Integer>();

            while (!q.isEmpty()){
                stkone.push(q.peek());
                q.remove();
            }

            while (!stkone.isEmpty()){
                q.add(stkone.peek());
                stkone.pop();
            }

        }

        public static void main(String arg[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                q.add(in.nextInt());
            }
            func();
            System.out.println(q);
        }
    }

