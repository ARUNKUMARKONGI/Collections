package TwoDimensionalArrays;
import java.util.*;
public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal elements
            sum += mat[i][i];

            // Add secondary diagonal elements (excluding those in primary diagonal)
            sum += mat[i][n - 1 - i];
        }

        // If the matrix has an odd size, subtract the center element as it's added twice
        if (n % 2 == 1) {
            int center = n / 2;
            sum -= mat[center][center];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = diagonalSum(matrix);
        System.out.println("Sum of Diagonals: " + result);
    }
}

