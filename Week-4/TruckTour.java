Hackerrank Link :https://www.hackerrank.com/challenges/truck-tour/problem
Submission Link :https://www.hackerrank.com/challenges/truck-tour/submissions/code/168914005


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long petrol[]=new long[n];
        long distance[]=new long[n];
        for(int i=0;i<n;i++)
        {
            petrol[i]=sc.nextLong();
            distance[i]=sc.nextLong();
        }
        long total=0;
        for(int i=0;i<n;i++)
        {
            total=0;
            int flag=0;
            total+=petrol[i];
            if(distance[i]>total)
                continue;
            else
                total-=distance[i];

            for(int j=i+1;(j)%n!=i;j++)
            {
                int t = j%n;
                total+=petrol[t];
                if(distance[t]>total)
                {
                    flag=1;
                    break;
                }
                else
                    total-=distance[t];
            }
            
            if(flag==0)
                {
                System.out.println(i);
                break;
            }
            
        }
    }
}