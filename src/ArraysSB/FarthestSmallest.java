package ArraysSB;

import java.util.Stack;

public class FarthestSmallest {
    public static void farthestSmallestToRight(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                result[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 5, 2, 4};
        System.out.print("Output for arr1: ");
        farthestSmallestToRight(arr1);

        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 0};
        System.out.print("Output for arr2: ");
        farthestSmallestToRight(arr2);
    }
}
