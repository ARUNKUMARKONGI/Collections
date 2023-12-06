import java.util.Arrays;
import java.util.Scanner;

class LIS {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int[] tails = new int[n];
        int len = 1;
        tails[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < tails[0]) {
                tails[0] = nums[i];
            } else if (nums[i] > tails[len - 1]) {
                tails[len++] = nums[i];
            } else {
                int index = Arrays.binarySearch(tails, 0, len, nums[i]);
                if (index < 0) {
                    index = -(index + 1);
                }
                tails[index] = nums[i];
            }
        }

        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = lengthOfLIS(nums);
        System.out.println("Length of the Longest Increasing Subsequence: " + result);
    }
}
