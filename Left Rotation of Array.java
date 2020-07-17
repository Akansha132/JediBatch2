import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    static void rotateLeft(int a[], int dim, int size) 
    { 
        for (int i = 0; i < dim; i++) 
            leftRotatebyOne(a, size); 
    } 
  
    static void leftRotatebyOne(int a[], int size) 
    { 
        int i, temp; 
        temp = a[0]; 
        for (i = 0; i < size - 1; i++) 
            a[i] = a[i + 1]; 
        a[i] = temp; 
    } 


  static void printRotatedArray(int a[], int size) 
{ 
    for (int i = 0; i < size; i++) 
     System.out.print(a[i] + " ");
}   

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
          rotateLeft (a,d,n);
          printRotatedArray(a, n);

        scanner.close();
    }
}
