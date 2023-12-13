package TwoDimensionalArrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class TwoDkthSamllestUsingArrayDuplicates {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from the user
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

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    set.add(matrix[i][j]);
                }
            }
            int[] uniqueArray = new int[set.size()];
            int index = 0;
            for (int element : set) {
                uniqueArray[index++] = element;
            }

            Arrays.sort(uniqueArray);

            return uniqueArray[k - 1];
        }
    }
