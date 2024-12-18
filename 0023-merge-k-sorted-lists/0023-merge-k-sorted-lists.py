# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists)==0:
            return None
        for i in range(1,len(lists)):
            lists[i]=self.mergeLists(lists[i-1],lists[i])
        return lists[-1]

    def mergeLists(self,list1,list2):
        temp=node=ListNode()
        while list1 and list2:
            if list1.val<=list2.val:
                node.next=list1
                list1=list1.next
            else:
                node.next=list2
                list2=list2.next
            node=node.next
        
        node.next=list1 or list2
        return temp.next
