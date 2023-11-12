package problems.leetcode.grind75.binarytree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> result = new LinkedList<>();

        bfs(List.of(root), result);

        return result;
    }

    private void bfs(List<TreeNode> nodes, List<Integer> result) {
        if (nodes.isEmpty()) return;
        result.add(nodes.get(nodes.size() - 1).val);

        List<TreeNode> childs = new LinkedList<>();
        for (TreeNode node : nodes) {
            if (node.left != null) childs.add(node.left);
            if (node.right != null) childs.add(node.right);
        }
        bfs(childs, result);
    }
}
