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

        }

        System.out.println("Binary Tree:");
        binaryTree.display(binaryTree.root);
    }
}
