Hackerrank Link : https://www.hackerrank.com/challenges/largest-rectangle/problem
Submission Link:  https://www.hackerrank.com/challenges/largest-rectangle/submissions/code/168874612


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


 static long largestRectangle(int[] h) {

    int i;
    long maxArea=0,area=0;
    Stack<Integer> stack=new Stack<>();
    for(i=0;i<h.length;)
    {
        if(stack.isEmpty()||h[stack.peek()]<=h[i])
        {
            stack.push(i++);
        }  
        else
        {
            int x=stack.pop();
            if(stack.isEmpty())
              {
                area=h[x]*i;
              }
            else
              {
                area=h[x]*(i-stack.peek()-1);
              }
            
            if(area>maxArea)
               maxArea=area;

        }   
    }

    while(!stack.isEmpty())
    {
        int x=stack.pop();

            if(stack.isEmpty())
            {
                area=h[x]*i;
            }
            else
            {
                area=h[x]*(i-stack.peek()-1);
            }


         if(area>maxArea)
            maxArea=area;  
        }

  return maxArea;  
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
