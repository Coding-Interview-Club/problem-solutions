// Solved Add Two Numbers II
// Leetcode problem 445
// https://leetcode.com/problems/add-two-numbers-ii/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
        
        // Pushing the lists' digits into two stacks.
        ListNode iter = l1;
        while(iter != null){
            s1.push(iter.val);
            iter = iter.next;            
        }
        iter = l2;
        while(iter != null){
            s2.push(iter.val);
            iter = iter.next;            
        }
        
        int carry = 0;
        ListNode out = new ListNode(0);
        // Popping each digit from each stack, building the
        // output list in reverse, from back to front.
        while(!s1.empty() || !s2.empty()){
            if(!s1.empty()) out.val += s1.pop();
            if(!s2.empty()) out.val += s2.pop();
            out.val += carry;
            carry = out.val / 10;
            out.val %= 10;
            ListNode new_node = new ListNode(0);
            new_node.next = out;
            out = new_node; 
        }

        out.val += carry;
        return (out.val == 0) ? out.next : out;
    }
}