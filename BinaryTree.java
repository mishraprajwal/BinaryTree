import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        CreateBinaryTree binaryTree = new CreateBinaryTree();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes in the binary tree:");
            int numberOfNodes = scanner.nextInt();
            System.out.println("Enter the values of the nodes:");
            for (int i = 0; i < numberOfNodes; i++) {
                binaryTree.insert(scanner.nextInt());
            }

        System.out.println("Inorder traversal for binary Tree:");
        binaryTree.displayInorder(binaryTree.root);

        System.out.println("Preorder traversal for binary Tree:");
        binaryTree.displayPreorder(binaryTree.root);

        System.out.println("Postorder traversal for binary Tree:");
        binaryTree.displayPostorder(binaryTree.root);

        System.out.println("Enter node 1:");
        int n1 = scanner.nextInt();

        System.out.println("Enter node 2:");
        int n2 = scanner.nextInt();

        DistanceBetweenTwoNodes distanceCalculator = new DistanceBetweenTwoNodes();
        int distance = distanceCalculator.findDistance(binaryTree.root, n1, n2);

        System.out.println("The distance between two nodes is " + distance);

        BinaryTreeMirror mirror = new BinaryTreeMirror();
        mirror.mirrorTree(binaryTree.root);

        System.out.println("The binary tree after mirroring is: ");
        binaryTree.displayInorder(binaryTree.root);

        ValidBST validator = new ValidBST();
        boolean isBST = validator.isValidBST(binaryTree.root);

        System.out.println("Is the binary tree a valid BST? " + isBST);

        System.out.println("Enter the key value for which you would like to find the predecessor:");
        int key = scanner.nextInt();

        FindPredecessor finder = new FindPredecessor();
        Node predecessor = finder.findPredecessor(binaryTree.root, key);

        System.out.println("The predecessor for" + key + " is  " + predecessor.value);





        }

        
    }
}
