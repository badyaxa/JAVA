package algorithm;

public class TreeTraversalAlgorithm {
    public static void main(String[] args) {
        TreeTraversalAlgorithm treeTraversalAlgorithm = new TreeTraversalAlgorithm();
        TreeNode tree = treeTraversalAlgorithm.createTree();
        System.out.println("Pre-order:");
        treeTraversalAlgorithm.preOrder(tree);
        System.out.println("\nIn-order:");
        treeTraversalAlgorithm.inOrder(tree);
        System.out.println("\nPost-order:");
        treeTraversalAlgorithm.postOrder(tree);
    }

    private TreeNode createTree() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        return tree;
    }

    // Pre-order: Root, Left, Right
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-order: Left, Root, Right
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    // Post-order: Left, Right, Root
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }
}
