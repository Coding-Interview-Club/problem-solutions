// Intersection of Two Linked Lists
// Leetcode Problem 160
// https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution{
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lengthA = getListLength(headA), lengthB = getListLength(headB);
        
        // Longest list is given a headstart until both head nodes are
        // at equal lengths.
        if(lengthA > lengthB) while(lengthA!=lengthB){
            headA = headA.next;
            lengthA--;
        }
        if(lengthB > lengthA) while(lengthA!=lengthB){
            headB = headB.next;
            lengthB--;
        }

        while(headA!=null&&headB!=null){
            if(headA==headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static int getListLength(ListNode head){
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}
