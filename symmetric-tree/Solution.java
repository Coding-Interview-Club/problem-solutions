// Symmetric Tree
// Leetcode problem 101
// https://leetcode.com/problems/symmetric-tree/

class Solution{
    public static boolean isSymmetric(TreeNode root){
        if(root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return (isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left));
    }
}
