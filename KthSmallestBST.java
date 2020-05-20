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
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> li = new ArrayList<>();
       inorder(root, li);       
       return li.get(k-1);
    }
    
    public void inorder(TreeNode n, List<Integer> l){
        if(n==null)
            return;
        inorder(n.left,l);
        l.add(n.val);
        inorder(n.right,l);
        
    }
}