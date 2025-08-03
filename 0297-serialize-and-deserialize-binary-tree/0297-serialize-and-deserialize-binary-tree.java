/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfsSerialize(res,root);
        return String.join(",",res);
    }

    private void dfsSerialize(List<String> res, TreeNode node){
        if(node==null){
            res.add("N");
            return;
        }
        res.add(String.valueOf(node.val));
        dfsSerialize(res,node.left);
        dfsSerialize(res,node.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] val = data.split(",");
        int[] i={0};
        return dfsDeserialize(val,i);
    }

    private TreeNode dfsDeserialize(String[] val, int[] i){
        if(val[i[0]].equals("N")){
            i[0]++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val[i[0]]));
        i[0]++;
        node.left = dfsDeserialize(val,i);
        node.right = dfsDeserialize(val,i);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));