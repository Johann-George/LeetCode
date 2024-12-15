# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        current=temp=head
        i,j=0,0
        while(current):
            i+=1
            current=current.next
        if i==1:
            return None
        res=i-n
        while(temp and temp.next):
            if j==res-1:
                temp.next=temp.next.next
            elif (res-1)==-1:
                return temp.next
            temp=temp.next
            j+=1
        return head
            
            

        