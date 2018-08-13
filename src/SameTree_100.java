/**
 * Created by daili on 2018/8/6.
 */
public class SameTree_100 {


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        SameTree_100 sameTree_100 = new SameTree_100();
        System.out.println(sameTree_100.isSameTree(p,q));
    }



    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p==null || q== null){
            return false;
        }
        if(p.val == q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }

        return false;
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) { val = x; }
}
