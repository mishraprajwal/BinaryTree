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

        }

        
    }
}
