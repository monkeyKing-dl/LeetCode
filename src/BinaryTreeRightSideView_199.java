import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by daili on 2018/9/23.
 */
public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if(root == null){
            return resultList;
        }
        Stack<TreeNode> firstStack = new Stack<>();
        Stack<TreeNode> secondStack = new Stack<>();
        firstStack.push(root);
        while (!firstStack.isEmpty()){
            resultList.add(firstStack.peek().val);
            //TreeNode tempNode;
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
            while (!secondStack.isEmpty()){
                TreeNode tempNode = secondStack.pop();
                if(tempNode.left!=null){
                    firstStack.push(tempNode.left);
                }
                if(tempNode.right != null){
                    firstStack.push(tempNode.right);
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView_199 b199 = new BinaryTreeRightSideView_199();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        b199.rightSideView(root);
    }
}
