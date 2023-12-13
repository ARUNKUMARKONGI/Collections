package TwoDimensionalArrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SpiralMatrixBasic {
        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();

            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return result;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            int top = 0, bottom = rows - 1, left = 0, right = cols - 1;


            // Traverse top row
            for (int i = 0; i <= cols-1; i++) {
                result.add(matrix[0][i]);
            }

            // Traverse right column
            for (int i = 1; i <= rows-1; i++) {
                result.add(matrix[i][right]);
            }

            for (int i = cols-2; i >= 0; i--) {
                result.add(matrix[bottom][i]);
            }


            for (int i = rows-2; i >= 1; i--) {
                result.add(matrix[i][0]);
            }


            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int m = scanner.nextInt();
            System.out.println("Enter the number of columns: ");
            int n = scanner.nextInt();
            int[][] matrix = new int[m][n];

            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            List<Integer> result = spiralOrder(matrix);
            System.out.println("Spiral Order: " + result);
        }
    }
