import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by daili on 2018/8/13.
 */
public class BinaryTreeLevelOrderTraversal_107 {


    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        dst(root,resultList,0);
        Collections.reverse(resultList);
        return resultList;
    }

    public void dst(TreeNode treeNode,List<List<Integer>> resultList,int level){
          if(treeNode == null){
              return;
          }
          if(level>=resultList.size()){
              resultList.add(level,new ArrayList<>());
          }
          if(treeNode.left!=null){
              dst(treeNode.left,resultList,level+1);
          }
          if(treeNode.right!=null){
              dst(treeNode.right,resultList,level+1);
          }
          if(resultList.get(level) == null){
              resultList.add(level,new ArrayList<>());
          }
          resultList.get(level).add(treeNode.val);
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal_107 b107 = new BinaryTreeLevelOrderTraversal_107();
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        b107.levelOrderBottom(treeNode);
    }



}

