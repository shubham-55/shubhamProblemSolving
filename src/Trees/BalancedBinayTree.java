package Trees;

public class BalancedBinayTree {
    public static boolean isBalanced= true;
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

            balanced(treeNode);
System.out.print(isBalanced);

        }

    private static void balanced(TreeNode treeNode) {
        getHieght(treeNode);


    }

    private static int getHieght(TreeNode treeNode) {
        if(treeNode == null){
            return 0;}

            int lh = getHieght(treeNode.left);
            int rh = getHieght(treeNode.right);

            if(Math.abs(lh - rh) >1) isBalanced = false;


            return Math.max(lh ,rh)+1;

        }
    }

