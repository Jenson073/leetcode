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
    public int sum(TreeNode root,int curr){
        if(root==null)return 0;//if null
        curr=curr*2+root.val;//to add binary digits we need to multiply by 2 as in case of decimals we multiply by 10
        if(root.left==null&&root.right==null)return curr;//if leaf node return curr sum
        return sum(root.left,curr)+sum(root.right,curr);//get the total sum of left and right
    }
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);//just return the sum from the local variable of the function sum 'curr'
    }
}