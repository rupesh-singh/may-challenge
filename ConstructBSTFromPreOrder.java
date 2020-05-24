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
    public TreeNode bstFromPreorder(int[] preorder) {
    
    TreeNode node = null;
    if(preorder.length==0)
         return null;
     for(int a: preorder){
         node = construct(node, a);
     }
        return node;
    }
    
    public TreeNode construct(TreeNode n, int a){
        TreeNode t = new TreeNode(a);
        if(n == null){
            n = t;
            return n;
        }
        else {
            TreeNode temp= n;
            while(temp!=null){
                if(temp.val >a){
                    if(temp.left==null){
                        temp.left=t;
                        break;
                    }
                    temp=temp.left;
                }
                else{
                    if(temp.right==null){
                        temp.right=t;
                        break;
                    }
                    temp=temp.right;
                }
            }
        }
        return n;
    }
}