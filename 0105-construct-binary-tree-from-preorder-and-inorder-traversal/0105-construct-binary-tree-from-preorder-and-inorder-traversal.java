/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,0,inorder.length-1);
    }
    public TreeNode dfs(int[] preorder, int l, int r){
        if (l>r) return null;
        int root_val = preorder[index++];
        TreeNode root = new TreeNode(root_val);
        int mid = map.get(root_val);
        root.left = dfs(preorder,l,mid-1);
        root.right = dfs(preorder,mid+1,r);
        return root;
    }
}