/* 101 Symmetric Tree
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Mirror {
 
    public boolean isSymmetric(TreeNode root)
    {
        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2)
    {
        if(t1 == null && t2 == null) return true;

        if(t1 == null || t2 == null) return false;

        if(t1.val != t2.val) return false;

        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {

        TreeNode root1= new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left =new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        Mirror m = new Mirror();
     System.out.println(m.isSymmetric(root1)); 

  }
}

            //      1
            //    /  \        
            //   2    2      
            //  / \  / \
            // 3   4 4  3
