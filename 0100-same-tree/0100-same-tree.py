# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        left_tree= deque([p])
        right_tree= deque([q])
        while left_tree or right_tree: 
            left_node=left_tree.popleft()
            right_node=right_tree.popleft()
            if not left_node and not right_node:
                continue
                
            if not left_node or not right_node or left_node.val!=right_node.val:
                return False
            
            left_tree.append(left_node.left)
            left_tree.append(left_node.right)
            right_tree.append(right_node.left)
            right_tree.append(right_node.right)
        return True
        
        