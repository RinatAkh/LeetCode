package Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Task111 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int counter = 0;
        while(queue.peek() != null) {
            int size = queue.size();
            counter++;
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.peek();
                if(current.left == null && current.right == null) {
                    return counter;
                }
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
                queue.remove();
            }
        }
        return counter;
    }
}
