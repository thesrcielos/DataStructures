package BinaryTreeFolder;

public class TestBinaryTree {
    public static void main(String[] args) {
        int[] values = { 4, 5, 6, 3, 8, 1 };
        BinaryTree tree = new BinaryTree(values);
        tree.inorder();
    }
}
