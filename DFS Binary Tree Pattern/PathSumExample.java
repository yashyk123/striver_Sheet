import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PathSumExample {

    // Function to check if path sum exists
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        // Log current call
        if (root != null) {
            System.out.println("Visiting Node " + root.val + " with targetSum = " + targetSum);
        } else {
            System.out.println("Visiting null with targetSum = " + targetSum);
        }

        // Base case: empty node
        if (root == null) return false;

        // If it's a leaf node, check sum
        if (root.left == null && root.right == null) {
            System.out.println("Leaf Node " + root.val + " → Check: " + targetSum + " == " + root.val);
            return targetSum == root.val;
        }

        // Recurse with reduced target
        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {
        // Build the tree
        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           /  \      \
          7    2      1
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        System.out.println("Target Sum = " + targetSum);
        boolean result = hasPathSum(root, targetSum);

        System.out.println("Final Result: " + result);
    }
}
