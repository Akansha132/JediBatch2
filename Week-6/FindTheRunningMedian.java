Problem Link : https://www.hackerrank.com/challenges/find-the-running-median/problem
Solution Link: https://www.hackerrank.com/challenges/find-the-running-median/submissions/code/171373609

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static float getMedianValue(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else if (list.size() % 2 == 1) {
            return list.get((list.size()) / 2);
        } else {
            return (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2f;
        }
    } 


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> theList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer theValue = in.nextInt();
            int low = 0;
            int high = theList.size();
            while (low < high) {
                int median = (low + high) / 2;
                if (theValue >= theList.get(median)) 
                {
                    low = median + 1;
                    if (median + 1 < theList.size() && theValue <= theList.get(median)) 
                    {
                        high = median + 1;
                    }
                } 
                else 
                {
                    high = median;
                    if (median > 0 && theValue >= theList.get(median - 1)) {
                        low = median;
                    }
                }
            }
            theList.add(low, theValue);
            System.out.println(String.format("%.1f", getMedianValue(theList)));
        }
    }

}
