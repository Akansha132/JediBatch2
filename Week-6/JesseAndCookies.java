Problem Link: https://www.hackerrank.com/challenges/jesse-and-cookies/problem
Solution Link: https://www.hackerrank.com/challenges/jesse-and-cookies/submissions/code/171364556

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your               class should be named Solution. */

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
          {
            queue.add(scan.nextInt());
          }
        int count=0;
        while(queue.peek()<k)
          {
            if(queue.size()>=2)
            {
              int x=queue.remove();
              int y=queue.remove();
              y=x+2*y;
              queue.add(y);
              count++;
            }
            else
            {
                count=-1;
                break;
            }
         }
        System.out.println(count);
    }

 }
