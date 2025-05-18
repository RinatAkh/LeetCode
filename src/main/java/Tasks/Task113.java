package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task113 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return res;
        }
        dfs(root, targetSum, new ArrayList<Integer>());
        return res;
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> path) {
        targetSum = targetSum - node.val;
        path.add(node.val);
        if(node.left == null && node.right == null && targetSum == 0) {
            res.add(new ArrayList<>(path));
        } else {
            if(node.left != null) {
                dfs(node.left, targetSum, path);
            }
            if(node.right != null) {
                dfs(node.right, targetSum, path);
            }
        }
        path.remove(path.size() - 1);
    }
}
