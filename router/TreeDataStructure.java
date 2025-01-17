package router;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    

}

public class TreeDataStructure {
     static class BinaryTree{
        int idx = -1;
        Node root = null;
        public  Node buildTree(int[] nodes) {
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
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                   return;
                }else{
                    q.add(null);
                }
            }else{
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

    public int diameter(Node root){
        if(root==null)return 0;
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = diameter(root.right);
        int self = lh+rh;
        return Math.max(self,Math.max(ld,rd))+1;
    }

    public int height(Node root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

   static class Info{
        int diam;
        int height;
        Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info findDiameterAndHeight(Node root){
        if(root==null)return new Info(0,0);
        Info leftInfo = findDiameterAndHeight(root.left);
        Info rightInfo = findDiameterAndHeight(root.right);
        int diam = Math.max(leftInfo.height + rightInfo.height, Math.max(leftInfo.diam,rightInfo.diam))+1;
        int height = Math.max(leftInfo.height,rightInfo.height)+1;

        return new Info(diam,height);
    }
    public static boolean isIdentical(Node root, Node subTree) {
        if (root == null && subTree == null) return true;
        if (root == null || subTree == null || root.data != subTree.data) {
            return false;
        }
        return isIdentical(root.left, subTree.left) && isIdentical(root.right, subTree.right);
    }
    
    public static boolean isSubTree(Node root, Node subTree) {
        if (root == null) {
            return false;
        }
        if (root.data == subTree.data && isIdentical(root, subTree)) {
            return true;
        }
        return isSubTree(root.left, subTree) || isSubTree(root.right, subTree);
    }
    class Info1{
        Node node;
        int hd;

        public Info1(Node node ,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static boolean topView(Node root){

    }
    
    public static void Bild() {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
       Info data =  findDiameterAndHeight(root);
       System.out.println(data.diam);
       System.out.println(data.height);
    }
}
