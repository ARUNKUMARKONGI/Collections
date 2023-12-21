package ArraysSB;

import java.util.HashSet;
import java.util.*;
public class LongestConsecutiveSubSequence {

        public static int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            // Create a HashSet to store unique elements of the array
            HashSet<Integer> numSet = new HashSet<>();
            for (int num : nums) {
                numSet.add(num);
            }

            int longestLength = 0;
            for (int num : numSet) {
                if (!numSet.contains(num - 1)) {
                    int curNum = num;
                    int curLength = 1;

                    while (numSet.contains(curNum + 1)) {
                        curNum++;
                        curLength++;
                    }
                    longestLength = Math.max(longestLength, curLength);
                }
            }
            return longestLength;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> list = new ArrayList<>();
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                list.add(num);
            }
            int[] nums = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
            System.out.println("Length of the longest consecutive subsequence: " + longestConsecutive(nums));
        }
    }
