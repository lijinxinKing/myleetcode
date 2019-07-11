package Easy;

public class mergeTrees {
    static TreeNode treeNode = new TreeNode(0);
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1!=null && t2!=null){
            treeNode.val = t1.val + t2.val;
            treeNode.left = t2.left;
        }

        if(t1==null && t2!=null){
            treeNode.left = t2.left;
        }

        mergeTrees(t1.right, t2.right);
        mergeTrees(t1.left, t2.left);

        StringBuilder sb = new StringBuilder("");

        return null;
    }


    public static void main(String[] args) {

    }
}
