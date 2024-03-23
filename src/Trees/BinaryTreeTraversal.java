package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
    static List<Integer> preOrd = new ArrayList<>();
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(8);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        treeNode.right.right.left = new TreeNode(9);
        treeNode.right.right.right = new TreeNode(10);

        List<Integer> preorder = new ArrayList<>();
        preorder = preOrderTrav(treeNode);

        System.out.print("the preorder travesal are: ");
        for(int i = 0; i< preorder.size();i++){
            System.out.print(preorder.get(i) + " ");
        }

    }

    private static List<Integer> preOrderTrav(TreeNode root) {
        dfs(root);
        return  preOrd;

    }

    private static void dfs(TreeNode root) {
        if(root == null) return;
        preOrd.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    private static void inOrderTrav(TreeNode root) {
        if(root == null) return;

        dfs(root.left);
        preOrd.add(root.val);
        dfs(root.right);

    }
}
