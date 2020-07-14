Hackerrank Link: https://www.hackerrank.com/challenges/maximum-element/problem
Submission Link: https://www.hackerrank.com/challenges/maximum-element/submissions/code/168884694

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxElement = new Stack<>();
        
        int query = input.nextInt();
        while(query-- >0)
        {
            int type = input.nextInt();
            if(type == 1)
            {
                int data = input.nextInt();
                stack.push(data);
                 if (stack.size() == 1)  
                 {  
                   maxElement.push(data);  
                 }  
                
                  if(data > maxElement.peek())
                       maxElement.push(data);
                    else
                       maxElement.push(maxElement.peek());   
                
            }     
            else if(type == 2)
            {
                
                stack.pop();
                maxElement.pop();
               
            }
            else
            {
                System.out.println(maxElement.peek());
            }
        }
        
    }
}
