package router;

public class AVLTree {
    static class Node{
        int data,height;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    public static Node root;
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    public static int getBalance(Node root){
        if(root==null)return 0;
        return height(root.left) - height(root.right);
    }
    static int mac(int a,int b){
        return Math.max(a,b);
    }
    // left rotate subtree rooted with x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;

        //Perform rotation

        y.left = x;
        x.right = t2;
        //Update heights
        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height = Math.max(height(y.left),height(root.right))+1;

        // return new root 
        return y;

    }
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node t2 = x.right;

        // perform rotation
        x.right = y;
        y.left = t2;
        y.height = Math.max(height(y.left),height(y.right));
        x.height = Math.max(height(x.left),height(x.right));
        return x;
    }
    public static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left = insert(root.left,key);
        }
        else if(key>root.data){
            root.right = insert(root.right, key);

        }
        else{
            return root;
        }

        root.height = 1+Math.max(height(root.left),height(root.right));

        int bf = getBalance(root);
        // left left case
        if(bf>1 && key< root.left.data){
            return rightRotate(root);
        }
        //right right case
        if(bf<-1 && key<root.left.data){
            return leftRotate(root);
        }

        //left right case
        if(bf>1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //right left case
        if(bf<-1 && key < root.right.data){
            root.right  = rightRotate(root.right);
            return leftRotate(root);
        }
        return root; 
    }
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
     public static void test() {
         root = insert(root, 10);
         root = insert(root,20);
         root = insert(root, 30);
         root = insert(root,40);
         root = insert(root,50);
         root = insert(root,25);

         inorder(root);
     }
}
