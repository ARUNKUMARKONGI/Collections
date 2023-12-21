package ArraysSB;

import java.util.Scanner;
import java.util.Arrays;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Distinct elements in the array:");
        System.out.print(array[0] + " ");

        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
