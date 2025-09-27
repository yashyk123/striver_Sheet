/*
 * 226. Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.
Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []
 
 */
import java.util.*;

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

class TreePrinter {

    // -------------------- PREORDER TRAVERSAL --------------------
    // Preorder = Root -> Left -> Right
    public static void printPreorder(TreeNode root) {
        if (root == null) return; // base case: if tree is empty or subtree is null, stop
        System.out.print(root.val + " "); // print current node (root)
        printPreorder(root.left); // recurse on left subtree
        printPreorder(root.right); // recurse on right subtree
    }


    // -------------------- LEVEL ORDER TRAVERSAL (BFS) --------------------
    // Prints the tree level by level, like a LeetCode array format
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[]"); // empty tree
            return;
        }

        // Use a queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // start with root node

        // List to store node values (and nulls for missing children)
        List<String> result = new ArrayList<>();

        // BFS traversal
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // take node from front of queue

            if (node == null) {
                result.add("null"); // record null if no child
                continue;
            }

            // Record current node value
            result.add(String.valueOf(node.val));

            // Add children to queue (can be null)
            queue.add(node.left);
            queue.add(node.right);
        }

        // -------------------- CLEANUP --------------------
        // Remove trailing nulls (they don’t change tree structure)
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) {
            i--;
        }

        // Print the list from [0...i] in LeetCode style
        System.out.println(result.subList(0, i + 1));
    }
}



// Utility class to print tree

public class InvertTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;

        // swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurse
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public static void main(String[] args) {
        

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

     //   InvertTree obj = new InvertTree();
       // System.out.println(obj.invertTree(root));

        TreeNode inverted = InvertTree.invertTree(root);
         // Print as preorder
        System.out.print("Preorder: ");
        TreePrinter.printPreorder(inverted);
        System.out.println();

        // Print as level order
        System.out.print("Level order: ");
        TreePrinter.printLevelOrder(inverted);
    }

}
