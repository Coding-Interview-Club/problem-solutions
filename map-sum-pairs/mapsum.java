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
                    t.sum+=value;
            }else{
                t = new TrieNode(c,value);
                children.put(c,t);
            }
 
            children = t.children;
 
            //set leaf node
            if(i==word.length()-1)
                t.isLeaf = true;    
        }
    }
    
    public TrieNode searchNode(String str){
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
    
    public int sum(String word) {
        TrieNode t = searchNode(word);
 
        if(t != null) 
            return t.sum;
        else
            return 0;
    }
}