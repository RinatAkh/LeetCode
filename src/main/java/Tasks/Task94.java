package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> result = new ArrayList<Integer>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
