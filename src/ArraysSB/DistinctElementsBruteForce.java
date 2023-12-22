package ArraysSB;
import java.util.Scanner;

public class DistinctElementsBruteForce {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

           System.out.println("Distinct elements in the array:");
            printDistinctElements(array, n);
        }

        private static void printDistinctElements(int[] array, int n) {
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
