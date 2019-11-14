package algorithm;
//平衡二叉树
public class L110_BalancedBinaryTree {

    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public boolean helpSymmetric(TreeNode node1,TreeNode node2){
        if(node1 == null){
            return node2 == null;
        }
        if(node2 == null){
            return node1 == null;
        }
        return (node1.val == node2.val) && helpSymmetric(node1.left,node2.right) && helpSymmetric(node1.right,node2.left);
    }
    public boolean isValidBST(TreeNode right,TreeNode left){
        if(right == null && left == null){
            return true;
        }
        if(left.val < right.val ){
            return  false;
        }
        return (right.val>left.val) && isValidBST(right.right, right.left) && isValidBST(left.right,left.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return helpSymmetric(root.left,root.right);
    }

    boolean helper(TreeNode root,int height){
        if(root == null){
            height = 0;
            return true;
        }
        int height1 = 0, height2=0;
        if (!helper(root.left,height1)){
            return false;
        }
        if (!helper(root.right,height2)){
            return false;
        }
        height = Math.max(height1,height2)+1;
        return (height1 <= height2-1)&&(height1 >= height2+1);

    }
    public boolean isBalanced(TreeNode root){
        int height =0;
        return helper(root,height);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
    }
}
