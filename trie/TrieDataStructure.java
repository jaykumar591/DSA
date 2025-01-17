package trie;

public class TrieDataStructure {

    static class Node {
        Node children[] = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        word = word.toLowerCase(); // Ensure the word is in lowercase
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        key = key.toLowerCase(); // Ensure the key is in lowercase
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0)return true;
        for(int i=0; i<key.length(); i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                 
                    return true;
                
            }
        }

        return false;
    }
    public static void checkString(String arr[],String matcher){
        for(String key : arr)insert(key);
       System.out.println( wordBreak(matcher));
    }

    public static void main(String[] args) {
        String words[] = {"Jay", "Kumar", "Singh", "village"};
        for (String word : words) {
            insert(word);
        }
        String key = "Jay";
        System.out.println(search(key)); // Should print true
    }
}
