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

    public int getheight(TreeNode node) {
        int height = 0;
        while(node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    public int countNodes(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int leftHeight = getheight(root.left);
        int rightHeight = getheight(root.right);

        if(leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }
}
