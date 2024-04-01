public class CreateBinaryTree {
    Node root;

    public CreateBinaryTree() {
        root = null;
    }

    public Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    public void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.println(" " + node.value);
            display(node.right);
        }
    }
}
