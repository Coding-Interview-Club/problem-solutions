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