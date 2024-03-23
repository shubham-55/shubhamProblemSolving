package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
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


            List<List<Integer>> aList = levelOrder(treeNode);
            for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if(root == null) return levels;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size()>0){
            List<Integer> lev = new ArrayList<>();
            for(int c = q.size(); c>0;c--){
                root = q.remove();
                lev.add(root.val);

                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            levels.add(lev);
        }
        return levels;
    }
}

