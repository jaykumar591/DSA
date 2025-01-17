package problem;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.*;

public class Problem {
   
    public static void nextGreaterElement(int arr[]){
        int n = arr.length;
        if(n==0)return;

        Stack<Integer> stack = new Stack<>();

        int temp[] = new int[ n];

        temp[n-1] = -1;
        for(int i=n-2; i>=0; i--){

            while (!stack.isEmpty() && stack.peek()<=arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i : temp){
            System.out.print(i+" ");
        }
        System.out.println();
        
    }

    static class Node implements Comparable<Node>{
        int data;
        public Node(int data){
            this.data = data;
        }

        public int compareTo(Node node){
            return  node.data - this.data;
        }

    }
    class TreeNode implements Comparable<TreeNode>{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            left=right= null;
        }

        @Override
        public int compareTo(TreeNode node){
            return this.data - node.data;
        }
    }

    
    public  static void bottomViewOfBinaryTree(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            list.add(-1);
            return;
        }

        bottomViewOfBinaryTree(root.left ,list);
        if(root.left==null){
            list.add(root.data);
        }
        if(root.right==null){
            list.add(root.data);
        }
        bottomViewOfBinaryTree(root.right,list);

    }
    static class CharNode implements Comparable<CharNode>{ 
        int freq;
        char ch;
        public CharNode(int freq, char ch){
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(CharNode node){
            return  node.freq - this.freq;
        }
    }
    public static void sortStringByFrequncy(String str){
        HashMap<Character ,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<CharNode> pq = new PriorityQueue<>();
        for(Character ch : map.keySet()){
            pq.add(new CharNode(map.get(ch),ch));
        }
        String result = "";
        for(CharNode ch : pq){
            int freq = ch.freq;
            while (freq!=0) {
                result += ch.ch;
                freq--;
            }
        }
        System.out.println(result);
    }
    
   

}
