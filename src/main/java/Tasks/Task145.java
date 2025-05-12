package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> result = new ArrayList<Integer>();

        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);

        return result;
    }
}
