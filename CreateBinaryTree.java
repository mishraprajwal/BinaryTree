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

    public void displayInorder(Node node) {
        if (node != null) {
            displayInorder(node.left);
            System.out.println(" " + node.value);
            displayInorder(node.right);
        }
    }
    
    public void displayPreorder(Node node) {
        if (node != null) {
            System.out.println(" " + node.value);
            displayPreorder(node.left);
            displayPreorder(node.right);
        }
    }

    public void displayPostorder(Node node) {
        if (node != null) {
            displayPostorder(node.left);
            displayPostorder(node.right);
            System.out.println(" " + node.value);
        }
    }

}
