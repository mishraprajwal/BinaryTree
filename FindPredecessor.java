public class FindPredecessor {

        public Node findPredecessor(Node root, int key) {
            Node current = root;
            Node predecessor = null;
    
            while (current != null) {
                if (key <= current.value) {
                    // Move to the left subtree if the key is less than or equal to current node's value
                    current = current.left;
                } else {
                    // If moving to the right subtree, update the predecessor to current node
                    predecessor = current;
                    current = current.right;
                }
            }
    
            return predecessor;
        }
    
}
