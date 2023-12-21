package TwoDimensionalArrays;

import java.util.*;

public class LuckyNumbersIn2DMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Lucky Numbers: " + luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] minInRow = new int[rows];
        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minInRow[i] = min;
        }

        int[] maxInCol = new int[cols];
        for (int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxInCol[j] = max;
        }

        Arrays.sort(minInRow);
        Arrays.sort(maxInCol);

        int i = 0, j = 0;
        while (i < rows && j < cols) {
            if (minInRow[i] == maxInCol[j]) {
                luckyNumbers.add(minInRow[i]);
                i++;
                j++;
            } else if (minInRow[i] < maxInCol[j]) {
                i++;
            } else {
                j++;
            }
        }

        return luckyNumbers;
    }
}
