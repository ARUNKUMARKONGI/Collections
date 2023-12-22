package ArraysSB;
import java.util.Scanner;

public class LeftSumRightSum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int[] resultArray = calculateDifferenceArray(array, n);

            for (int i = 0; i < n; i++) {
                System.out.print(resultArray[i] + " ");
            }
        }

        private static int[] calculateDifferenceArray(int[] array, int n) {
            int[] resultArray = new int[n];

            for (int i = 0; i < n; i++) {
                int leftSum = calculateLeftSum(array, i);
                int rightSum = calculateRightSum(array, i, n);
                resultArray[i] = Math.abs(leftSum - rightSum);
            }

            return resultArray;
        }

        private static int calculateLeftSum(int[] array, int index) {
            int leftSum = 0;
            for (int i = 0; i < index; i++) {
                leftSum += array[i];
            }
            return leftSum;
        }

        private static int calculateRightSum(int[] array, int index, int n) {
            int rightSum = 0;
            for (int i = index + 1; i < n; i++) {
                rightSum += array[i];
            }
            return rightSum;
        }
    }
