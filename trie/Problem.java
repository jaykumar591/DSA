package trie;

public class Problem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;
       public Node(){
         for(int i=0; i<children.length; i++){
            children[i] = null;
            freq = 1;
         }
        }
    }

    public static Node root = new Node();

    public static void insert(String key){
        Node curr = root;
        if(key.length()==0)return;

        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            else{
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

    }
}
