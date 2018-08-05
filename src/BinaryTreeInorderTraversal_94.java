import java.util.ArrayList;
import java.util.List;

/**
 * Created by daili on 2018/8/5.
 */
public class BinaryTreeInorderTraversal_94 {

     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> resultList = new ArrayList<>();
        if(root == null){
            return resultList;
        }

        if(root.left != null){
           resultList.addAll(inorderTraversal(root.left));
        }

        resultList.add(root.val);

        if(root.right!=null){
         resultList.addAll(inorderTraversal(root.right));
        }
        return resultList;
    }
}
