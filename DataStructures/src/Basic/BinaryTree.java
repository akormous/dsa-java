package Basic;

public class BinaryTree {
    public TreeNode root;
    public void printInorder(TreeNode root) {
        if(root == null)    return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    public void printPreorder(TreeNode root) {
        if(root == null)    return;
        System.out.print(root.val + " ");
        printInorder(root.left);
        printInorder(root.right);
    }
    public void printPostorder(TreeNode root) {
        if(root == null)    return;
        printInorder(root.left);
        printInorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(0);
        bt.root.left = new TreeNode(1);
        bt.root.right = new TreeNode(2);

        bt.root.left.left = new TreeNode(3);
        bt.root.left.right = new TreeNode(4);

        bt.root.right.left = new TreeNode(5);
        bt.root.right.right = new TreeNode(6);

        System.out.println("\nINORDER");
        bt.printInorder(bt.root);

        System.out.println("\nPREORDER");
        bt.printPreorder(bt.root);

        System.out.println("\nPOSTORDER");
        bt.printPostorder(bt.root);

    }
}
