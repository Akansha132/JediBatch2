import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the powerSum function below.
    static int result = 0; 
    static int powerSum(int X, int N) {

       return checkRecursive(X, X, 0, N); 
    }


    static int checkRecursive(int num, int x, int k, int n) 
    { 
        if (x == 0)  
            result++; 
          
        int remainder = (int)Math.floor(Math.pow(num, 1.0 / n)); 
  
        for (int i = k + 1; i <= remainder; i++) { 
            int a = x - (int)Math.pow(i, n); 
          if (a >= 0) 
            checkRecursive(num,  
                   x - (int)Math.pow(i, n), i, n); 
        } 
        return result; 
    } 
      
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}