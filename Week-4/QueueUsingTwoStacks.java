Hackerrank Link :https://www.hackerrank.com/challenges/queue-using-two-stacks/problem 
Submission Link :https://www.hackerrank.com/challenges/queue-using-two-stacks/submissions/code/168865809

import java.io.*;
import java.util.*;

public class Solution {

  
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int query = input.nextInt(); 
        while(query-- > 0)
        {
           int type = input.nextInt();

           if(type==1)
            {
               int x = input.nextInt();
               stack1.push(x);
            }
           else if(type == 2)
            {
            if(stack2.isEmpty())
               {
                while(!stack1.isEmpty())
                  {
                    stack2.push(stack1.pop());
                  }

               }
            stack2.pop();
            }
           else
            {
              if(stack2.isEmpty()) 
              {
                  while(!stack1.isEmpty())
                  {
                      stack2.push(stack1.pop());
                  }
              }
              System.out.println(stack2.peek());
           }
       }
  }
}
