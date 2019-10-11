// Same tree
// Leetcode problem 100
// https://leetcode.com/problems/same-tree/

class Solution{
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null || q == null)
            return p == q;
        if(p.val != q.val)
            return false;
        if(!isSameTree(p.left, q.left))
            return false;
        if(!isSameTree(p.right, q.right))
            return false;
        return true;
    }
}
