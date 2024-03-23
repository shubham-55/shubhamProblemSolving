package Trees;

public class Dameter {
    static int diameter =0;
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

        Daimetr(treeNode);
        System.out.print(diameter);
    }

    private static int Daimetr(TreeNode treeNode) {
        if(treeNode == null) return 0;
        hieght(treeNode);
        return diameter-1;

    }

    private static int hieght(TreeNode root) {
        if(root== null) return 0;

        int lh = hieght(root.left);
        int rh = hieght(root.right);

        diameter = Math.max(diameter,lh +rh+1);
        return Math.max(lh,rh) +1;
    }
}