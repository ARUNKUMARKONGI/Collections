package TwoDimensionalArrays;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class kthSMallest2DwithDuplicateRemoval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int kthSmallest = findKthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }

    private static int findKthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int element = matrix[i][j];
                if (uniqueElements.add(element)) {
                    pq.offer(element);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res=pq.poll();
        }
        return res;
    }
}

