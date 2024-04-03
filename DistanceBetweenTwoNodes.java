public class DistanceBetweenTwoNodes {
    
    public int findDistance(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);

        return distanceFromLCA(lca, n1, 0) + distanceFromLCA(lca, n2, 0);
    }

    private Node findLCA(Node node, int n1, int n2) {
        if (node == null) return null;

        if (node.value > n1 && node.value > n2) {
            return findLCA(node.left, n1, n2);
        }

        if (node.value < n1 && node.value < n2) {
            return findLCA(node.right, n1, n2);
        }

        return node;
    }

    private int distanceFromLCA(Node node, int n, int level) {
        if (node == null) return -1;
        if (node.value == n) return level;
        
        int leftDistance = distanceFromLCA(node.left, n, level + 1);
        if (leftDistance == -1) {

            return distanceFromLCA(node.right, n, level + 1);
        }

        return leftDistance;
    }
}
