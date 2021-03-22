package Leetcode103;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> listList=new ArrayList<>();
        if(root==null){
            return listList;
        }
        List<List<TreeNode>> listListT=new ArrayList<>();
        List<TreeNode> list=new ArrayList<>();
        list.add(root);
        listListT.add(list);
        int t=0;
        while(true){
            int flag=0;
            List<TreeNode> listT=new ArrayList<>();
            if(t==0){//从左往右
                for (TreeNode treeNode : list) {
                    if (treeNode.left != null) {
                        listT.add(treeNode.left);
                        flag=1;
                    }
                    if (treeNode.right != null) {
                        listT.add(treeNode.right);
                        flag=1;
                    }
                }
            }
            else{
                int len=list.size();
                for (int i=len-1 ;i>=0 ;i--) {
                    TreeNode treeNode=list.get(i);
                    if(treeNode.right!=null){
                        listT.add(treeNode.right);
                        flag=1;
                    }
                    if(treeNode.left!=null){
                        listT.add(treeNode.left);
                        flag=1;
                    }
                }
            }
            if(flag==0){
                break;
            }
            listListT.add(listT);
            list=listT;
            t++;
        }
        for (List<TreeNode> treeNodes : listListT) {
            List<Integer> list1=new ArrayList<>();
            for (TreeNode treeNode : treeNodes) {
                list1.add(treeNode.val);
            }
            listList.add(list1);
        }
        return listList;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}