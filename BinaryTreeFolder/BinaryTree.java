package BinaryTreeFolder;

public class BinaryTree {
    private Node root;
    private int height;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int[] values) {
        this();
        for (int value : values) {
            add(value);
        }
    }

    public void add(int value) {
        if (root == null)
            root = new Node(value);
        else
            addNode(value, root);
    }

    public Node addNode(int value, Node root) {
        if (root == null) {
            root = new Node(value);
            height = calculateHeight(root, 0);
            return root;
        }
        if (value > root.getValue()) {
            root.setRight(addNode(value, root.getRight()));
        } else
            root.setLeft(addNode(value, root.getLeft()));
        return root;
    }

    public int getHeight() {
        return height;
    }

    private int calculateHeight(Node root, int height) {
        if (root == null) {
            return height;
        }
        return Math.max(calculateHeight(root.getLeft(), height + 1), calculateHeight(root.getRight(), height + 1));
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getValue() + " ");
            inorderRec(root.getRight());
        }
    }
}

class Node {
    private int value;
    private Node left, right;

    Node() {
    }

    Node(int value) {
        this.value = value;
        left = right = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setRight(Node node) {
        right = node;
    }

}