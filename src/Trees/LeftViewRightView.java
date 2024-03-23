package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeftViewRightView {
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

        List<Integer> aList = leftView(treeNode);
        for (Integer i:aList)
            System.out.print(i + " ");
    }

    private static List<Integer> leftView(TreeNode treeNode) {
        ArrayList<Integer> left = new ArrayList<>();
        if(treeNode == null) return  left;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(treeNode);
        while(q.size()>0){
            left.add(q.peek().val);
            for(int c= q.size();c>0;c--){
                treeNode = q.remove();
                if(treeNode.left != null) q.add(treeNode.left);
                if(treeNode.right != null) q.add(treeNode.right);
            }
        }

        return left;
    }
}
