Hackerrank Link : https://www.hackerrank.com/challenges/swap-nodes-algo/problem
Hackerrank Solution : https://www.hackerrank.com/challenges/swap-nodes-algo/submissions/code/170280682

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;
    public int depth;
    public Node(int data){
        this.data = data;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
}

public class Solution {

    public static void inOrder(Node root) {
        if(root == null){
            return;
        }    
        inOrder(root.left);
        System.out.print(root.data+" ");        
        inOrder(root.right);        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node[] ar = new Node[N];
        for(int i=0; i<N; i++){
            ar[i] = new Node(i+1);
        }
        ar[0].setDepth(1);
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a!=-1){
                ar[i].left = ar[a-1];
                ar[a-1].setDepth(ar[i].depth + 1);
            }
            if(b!=-1){
                ar[i].right = ar[b-1];
                ar[b-1].setDepth(ar[i].depth + 1);
            }
        }
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int K = sc.nextInt();
            Queue<Node> list =  new LinkedList<Node>();
            list.add(ar[0]);
            while(!list.isEmpty()){
                Node node = list.remove();
                if(node.depth % K == 0){
                    Node temp = node.left;
                    node.left = node.right;
                    node.right = temp;
                }
                if(node.left!=null)
                    list.add(node.left);
                if(node.right != null)
                    list.add(node.right);
            }
            
            inOrder(ar[0]);
            System.out.println();
        }
        
    }
}