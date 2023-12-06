import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class LevelOrderTree {
    static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = null;
        char choice;
        do {
            System.out.print("Enter the value for the new node: ");
            int nodeValue = scanner.nextInt();

            if (root == null) {
                root = new TreeNode(nodeValue);
            } else {
                insertNode(root, nodeValue);
            }
            System.out.print("Do you want to add another node? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (Character.toLowerCase(choice) == 'y');

        System.out.println("Level-order traversal:");
        levelOrderTraversal(root);

        System.out.println("\nPreorder traversal:");
        preorderTraversal(root);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    static void insertNode(TreeNode root, int value) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left == null) {
                current.left = new TreeNode(value);
                return;
            } else {
                queue.offer(current.left);
            }

            if (current.right == null) {
                current.right = new TreeNode(value);
                return;
            } else {
                queue.offer(current.right);
            }
        }
    }
}
