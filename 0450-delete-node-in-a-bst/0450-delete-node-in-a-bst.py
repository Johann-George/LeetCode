# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if not root:
            return root
        
        if key>root.val:
            root.right=self.deleteNode(root.right,key)
        elif key<root.val:
            root.left=self.deleteNode(root.left,key)
        else:
            if root.left is None:
                return root.right
            elif root.right is None:
                return root.left
        
            node=root.left
            while node.right:
                node=node.right
            root.val=node.val
            root.left=self.deleteNode(root.left,node.val)
        return root    