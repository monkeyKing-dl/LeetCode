/**
 * Created by daili on 2018/8/6.
 */
public class ConstuctBinaryTree_105 {

    public static void main(String[] args) {
        ConstuctBinaryTree_105 constuctBinaryTree_105 = new ConstuctBinaryTree_105();
        int[] preOrderArrays = new int[]{3,9,20,15,7};
        int[] inOrderArrays = new int[]{9,3,15,20,7};
        System.out.println(constuctBinaryTree_105.buildTree(preOrderArrays,inOrderArrays));
    }

      public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return constructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        }

        public TreeNode constructTree(int[] preorder,int preStartIndex,int preEndIndex,int[] inorder,int inStartIndex,int inEndIndex){
            if(preStartIndex >= preEndIndex ){
                return null;
            }
            if(preStartIndex == preEndIndex){
                return new TreeNode(preorder[preEndIndex]);
            }
            int inNodeRootIndex=0;
            for(int i=inStartIndex;i<=inEndIndex;i++){
                if(inorder[i] == preorder[preStartIndex]){
                    inNodeRootIndex ++;
                    break;
                }
            }
            TreeNode rootNode = new TreeNode(preorder[preStartIndex]);
            rootNode.left = constructTree(preorder,preStartIndex+1,preStartIndex+inNodeRootIndex,inorder,inStartIndex,inStartIndex+inNodeRootIndex);
            rootNode.right = constructTree(preorder,preStartIndex+inNodeRootIndex+1,preEndIndex,inorder,inStartIndex+inNodeRootIndex+1,inEndIndex);
            return rootNode;
        }
}
