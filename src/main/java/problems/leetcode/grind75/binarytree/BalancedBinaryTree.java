package problems.leetcode.grind75.binarytree;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return treeHeight(root) != -1;
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        int left = treeHeight(node.left);
        if (left == -1) return -1;
        int right = treeHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(right - left) > 1) return -1;

        return 1 + Math.max(right, left);
    }
}
