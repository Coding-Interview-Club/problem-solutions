// LRU Cache
// Leetcode Problem 146
// https://leetcode.com/problems/lru-cache/

class LRUCache{

    // Doubly linked list node.
    private class Node{
        int value;
        int key;
        Node prev;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node tail;
    int capacity;
    int size;
    Map<Integer, Node> mappings;

    public LRUCache(int capacity){
        head = null;
        tail = null;
        size = 0;
        this.capacity = capacity;
        mappings = new HashMap<Integer, Node>();
    }
    
    public int get(int key){
        // Non-existent entry.
        if(!mappings.containsKey(key))
            return -1;
        
        Node n = mappings.get(key);
        moveToFront(n);
        return n.value;
    }
    
    public void put(int key, int value){
        // If the key is already there, only the value needs to
        // be updated and the value needs to be moved to the front.
        if(mappings.containsKey(key)){
            Node n = mappings.get(key);
            n.value = value;
            moveToFront(n);
            return;
        }
        
        Node new_node = new Node(key, value);
        
        mappings.put(key, new_node);
        size++;
        moveToFront(new_node);
        if(size > capacity)
            removeTail();
    }

    private void moveToFront(Node n){
        if(n == null)
            return;
        if(n == head)
            return;
        if(head == null || tail == null){
            head = n;
            tail = n;
            return;
        }

        if(n == tail)
            tail = n.prev;
        
        if(n.prev != null)
            n.prev.next = n.next;
        if(n.next != null)
            n.next.prev = n.prev;
        
        n.next = head;
        n.next.prev = n;
        head = n;
    }

    private void removeTail(){
        if(tail != null)
            mappings.remove(tail.key);
        
        if(head == null || tail == null)
            return;
        
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        
        tail.prev.next = null;
        tail = tail.prev;
        size--;
    }
}