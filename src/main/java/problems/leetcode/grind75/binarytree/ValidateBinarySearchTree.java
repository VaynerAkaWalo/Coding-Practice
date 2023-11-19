package problems.leetcode.grind75.binarytree;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isValidBST(TreeNode root, int max, int min) {
        if (root == null) return true;
        if (root.val < min || root.val > max) return false;
        if (root.left == null && root.right == null) return true;
        if (root.left != null && root.left.val >= root.val) return false;
        if (root.right != null && root.right.val <= root.val) return false;

        return isValidBST(root.left, root.val - 1, min) &&
                isValidBST(root.right, max, root.val + 1);
    }
}
