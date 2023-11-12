package problems.leetcode.grind75.binarytree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new LinkedList<>();
        bfs(List.of(root), result);

        return result;
    }

    private void bfs(List<TreeNode> nodes, List<List<Integer>> result) {
        if (nodes.isEmpty()) return;
        List<Integer> visited = new LinkedList<>();
        List<TreeNode> childs = new LinkedList<>();
        for (TreeNode node : nodes) {
            visited.add(node.val);
            if (node.left != null) childs.add(node.left);
            if (node.right != null) childs.add(node.right);
        }
        result.add(visited);
        bfs(childs, result);
    }
}
