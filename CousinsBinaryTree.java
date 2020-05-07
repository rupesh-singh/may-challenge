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
    public boolean isCousins(TreeNode root, int x, int y) {
    int level = -1, Lx=0,Ly=0,Px=0,Py=0;
    Queue<TreeNode> que= new LinkedList<>();
    List<TreeNode> removedNode = new ArrayList<>();
    que.add(root);
    que.add(null);
        
    while(que.size()>0){
        TreeNode node= que.peek();
        que.remove();
        if(node == null){
            level++;
            if(que.size()!=0)
                que.add(null);
        }
        else{
                if(node.val==x){
                    Lx=level+1;
                    Px= findParent(removedNode,x);
                }
                else if(node.val==y){
                    Ly=level+1;
                     Py= findParent(removedNode,y);
                }

                if(node.left!=null)
                    que.add(node.left);
                if(node.right!=null)
                    que.add(node.right);
            removedNode.add(node);
            }
    }
        if(Lx==Ly && Px!=Py)
            return true;
        else
            return false;
        
    
    
    }
    
    public int findParent(List<TreeNode> list, int n){
        for(int i = list.size()-1;i>=0;i--){
            TreeNode nod= list.get(i);
            if((nod.left!=null && nod.left.val==n) || (nod.right!=null && nod.right.val==n))
                return nod.val;                
            
        }
        return -1;
    }
    
}