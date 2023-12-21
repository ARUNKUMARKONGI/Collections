package ArraysSB;

import java.util.Scanner;

public class uniqueElementsUsingCountArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            findAndPrintUniqueElements(array);
        }

        private static void findAndPrintUniqueElements(int[] array) {
            int[] countArray = new int[10000]; // Assuming a range of numbers

            for (int num : array) {
                countArray[num]++;
            }

            for (int num : array) {
                if (countArray[num] == 1) {
                    System.out.print(num + " ");
                }
            }
        }
    }

