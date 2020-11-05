/** Adding the solution like this until I think of an implementation for multi-file solutions */
/**
This implementation of MapSum is based off of the Trie, or Prefix Tree, data structure

Trie's work by storing nodes based off of each character in a word, so the word Tree would be stored as 
            T 
          /
         R
        /
      E
     /
    E

By passing a value in addition to a word, we can set each node's sum value as we go inserting the word into the Trie
Doing this only required some slight changes, which were:
[1]:adds the inserted words value to the existing sum
[2]:initializes the new Node with the value if it doesn't already exist
[3]:a modification of the prefix method from the original data structure that now returns an int instead of a boolean
 */
class Solution{}//to stop Java from yelling at me
class MapSum {
    TrieNode root;    
    public MapSum(){
        root = new TrieNode();
    }
    
    public void insert(String word, int value) {
        HashMap<Character, TrieNode> children = root.children;
 
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
 
            TrieNode t;
            if(children.containsKey(c)){
                    t = children.get(c);
                    t.sum+=value;//[1]
            }else{
                t = new TrieNode(c,value);//[2]
                children.put(c,t);
            }
 
            children = t.children;
 
            if(i==word.length()-1)
                t.isLeaf = true;    
        }
    }
    
    public TrieNode searchNode(String str){//
        Map<Character, TrieNode> children = root.children; 
        TrieNode t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else{
                return null;
            }
        }
 
        return t;
    }
    
    public int sum(String word) {//[3]
        TrieNode t = searchNode(word);
 
        if(t != null) 
            return t.sum;
        else
            return 0;
    }
}
/**
Node's for the MapSum class are a very slight modifcation to TrieNode
Each node contains its own value, representing the summation of all of it's child nodes

The main differences between this and the usual TrieNode implementation are:
[1] - a new local variable representing the sum of the Node's and all of it's children's values
[2] - the constructor method has been modified to require a value in addition to the character for the node - this is used in the MapSum class
 */
class TrieNode{
    char c;
    HashMap<Character,TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;
    int sum;//[1]    
    public TrieNode(){}
    
    public TrieNode(char c,int v){//[2]
        this.c=c;
        this.sum=v;
    }
}