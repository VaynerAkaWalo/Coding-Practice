package problems.leetcode.grind75.binarytree;

import java.util.Arrays;

public class DiameterOfBinaryTree {

    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);

        return Math.max(left + right, maxDiameter);
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        int left = treeHeight(node.left);
        int right = treeHeight(node.right);

        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }
}
