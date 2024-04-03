public class ValidBST {

    public boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(Node node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }
        
        if (node.value <= minVal || node.value >= maxVal) {
            return false;
        }

        return isValidBST(node.left, minVal, node.value) && isValidBST(node.right, node.value, maxVal);
    }
}

