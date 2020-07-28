import java.io.*;
import java.util.*;
import java.text.*;
Problem Link :https://www.hackerrank.com/challenges/qheap1/problem
Solution Link:https://www.hackerrank.com/challenges/qheap1/submissions/code/171362251



import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
        int ops = sc.nextInt();
        for(int i=0;i<ops;++i) {
            int op = sc.nextInt();
            if(op == 1) {
                pq.offer(sc.nextInt());
            } else if(op == 2) {
                pq.remove(sc.nextInt());
            } else{
                System.out.println(pq.peek());
            }
        }
    }
}
