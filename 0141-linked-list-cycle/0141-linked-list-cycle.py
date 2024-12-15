# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        prev=head
        current=prev
        while(current and current.next):            
            prev=prev.next
            current=current.next.next
            if current==prev:
                return True
        return False
