package ArraysSB;
import java.util.Scanner;

public class DuplicateNumber2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int n = scanner.nextInt();
            int[] nums = new int[n + 1];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int result = findDuplicate(nums);
            System.out.println("The repeated number is: " + result);
        }
        public static int findDuplicate(int[] nums) {
            int len = nums.length;
            int[] cnt = new int[len + 1];
            for (int i = 0; i < len; i++) {
                cnt[nums[i]]++;
                if (cnt[nums[i]] > 1) {
                    return nums[i];
                }
            }
            return 0;
        }
    }



//this approach takes extra count memory space complexity O(n)