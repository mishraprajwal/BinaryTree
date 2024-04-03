class BinaryTreeMirror {

    public void mirrorTree (Node node) {
        if (node == null) {
            return;
        }

        mirrorTree(node.left);
        mirrorTree(node.right);

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
