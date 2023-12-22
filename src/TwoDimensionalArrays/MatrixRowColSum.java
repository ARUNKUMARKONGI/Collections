package TwoDimensionalArrays;
import java.util.Scanner;
public class MatrixRowColSum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input matrix dimensions
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            // Input matrix elements
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Calculate and print sum of each row
            System.out.println("Sum of each row:");
            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Row " + (i + 1) + ": " + rowSum);
            }

            // Calculate and print sum of each column
            System.out.println("Sum of each column:");
            for (int j = 0; j < cols; j++) {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Column " + (j + 1) + ": " + colSum);
            }
        }
    }
