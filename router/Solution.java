package router;
import java.util.*;

import recursion.printNUmber;

public class Solution {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static void BST(Node root){
        if(root==null)return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode ==null){
                System.out.println();
                if(q.isEmpty())break;
                else q.add(null);
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public void kthLevel(Node root , int level,int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.println(root.data+" ");
        }
        kthLevel(root.left,level+1,k);
        kthLevel(root.right , level+1, k);
    }

    

    public static void main(String[] args) {
        BinaryTree tre = new BinaryTree();
        int arr[] = {1,2,-1,-1};
        Node root = tre.buildTree(arr);
    }


}
