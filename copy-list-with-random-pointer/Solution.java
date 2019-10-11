// Copy List with Random Pointer
// Leetcode problem 138
// https://leetcode.com/problems/copy-list-with-random-pointer/

class Solution{
    public static Node copyRandomList(Node head){
        if(head == null) return null;
        Node out = new Node();
        // Map will contain orignal list to new list nodes keys/values.
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node oiter = out, iiter = head;
        while(iiter != null){
            oiter.val = iiter.val;
            map.put(iiter, oiter);
            if(iiter.next != null) oiter.next = new Node();
            iiter = iiter.next;
            oiter = oiter.next;
        }
        oiter = out;
        iiter = head;
        while(iiter != null){
            oiter.random = map.getOrDefault(iiter.random, null);
            oiter = oiter.next;
            iiter = iiter.next;
        }
        return out;
    }
}