"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        if not head:
            return None

        old_to_new = {}
        new_list_head = Node(head.val)
        
        old_iter = head
        new_iter = new_list_head
        old_to_new[head] = new_list_head
        old_to_new[None] = None

        while old_iter.next:
            new_iter.next = Node(old_iter.next.val)
            new_iter = new_iter.next
            old_iter = old_iter.next

            old_to_new[old_iter] = new_iter


        old_iter = head
        new_iter = new_list_head
        while old_iter and new_iter:
            new_iter.random = old_to_new[old_iter.random]
            new_iter = new_iter.next
            old_iter = old_iter.next

        return new_list_head
