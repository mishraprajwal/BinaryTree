public class ValidBST {

    public boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(Node node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }
        // Check if the current node's value falls within the valid range
        if (node.value <= minVal || node.value >= maxVal) {
            return false;
        }
        // Recursively validate the left and right subtrees
        return isValidBST(node.left, minVal, node.value) && isValidBST(node.right, node.value, maxVal);
    }
}

