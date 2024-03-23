package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
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


        ArrayList<Integer> arrayList = levelOrder(treeNode);
        for (Integer i:arrayList)
            System.out.print(i + " ");
    }

    private static ArrayList<Integer> levelOrder(TreeNode root) {
        ArrayList<Integer> bfs = new ArrayList<>();
        if(root == null) return bfs;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size()>0){
            root = q.remove();
            bfs.add(root.val);

            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
        }
        return bfs;
    }
}
