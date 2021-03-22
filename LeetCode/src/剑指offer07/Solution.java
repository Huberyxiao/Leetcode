package 剑指offer07;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeD(preorder,inorder,0,inorder.length,0);
    }
    public TreeNode buildTreeD(int[] preorder, int[] inorder,int inorder_left,int inorder_right,int preorder_pre) {
        if (preorder_pre==preorder.length-1||inorder_left>=inorder_right){
            return null;
        }else {
            //左中遍历和右树中序遍历
            int i=0;
            for (i = inorder_left; i < inorder_right; i++) {
                if (inorder[i]==preorder[0]){
                    break;
                }
            }
            if (i==inorder_right) return null;
            TreeNode treeNode=new TreeNode(preorder[0]);
            treeNode.left=buildTreeD(preorder,inorder,inorder_left,i,preorder_pre+1);
            treeNode.right=buildTreeD(preorder,inorder,i+1,inorder_right,preorder_pre+1);
            return treeNode;
        }
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
