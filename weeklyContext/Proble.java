import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Proble{
    
    public static int findDifference(Node root1,Node root2){

        return 0;
    }
    public static void levelwise(Node root , ArrayList<Integer> list){
        if(root==null)return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            list.add(currNode.data);

            if(currNode.left!=null){
                queue.add(currNode.left);
            }

            if(currNode.right!=null){
                queue.add(currNode.right);
            }
        }
    }
}