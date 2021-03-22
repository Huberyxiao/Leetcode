package 剑指offer07;

public class Main {
    public static void main(String[] args) {
        int[] preorder=new int[]{3,9,20,15,7};
        int[] inorder=new int[]{9,3,15,20,7};
        System.out.println(new Solution().buildTree(preorder,inorder));
    }
}
