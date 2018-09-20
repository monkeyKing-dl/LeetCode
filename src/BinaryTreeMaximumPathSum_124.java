/**
 * Created by daili on 2018/9/20.
 */

public class BinaryTreeMaximumPathSum_124 {


    static int maxNum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
         getMaxRoad(root);
         return maxNum;
    }

    public int getMaxRoad(TreeNode root){
        if(root == null){
            return 0;
        }
        int value = root.val;
        int leftMax = Math.max(0,getMaxRoad(root.left));
        int rightMax = Math.max(0,getMaxRoad(root.right));
        maxNum = Math.max(maxNum,value+leftMax+rightMax);
        return Math.max(leftMax,rightMax)+value;

    }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum_124 binaryTreeMaximumPathSum124 = new BinaryTreeMaximumPathSum_124();
        TreeNode root = new TreeNode(0);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        System.out.println(binaryTreeMaximumPathSum124.maxPathSum(root));
    }
}


