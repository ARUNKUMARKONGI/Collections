package ArraysSB;
import java.util.Scanner;
public class DuplicateOptimized {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array (N): ");
            int N = scanner.nextInt();

            int[] array = new int[N+1];  //doesnt work for any other size
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            int duplicate = findDuplicateNumber(array);
            if(duplicate==-1)
                System.out.println("No duplicate element present");
            else
            System.out.println("Duplicate Element is: " + duplicate);
        }

        public static int findDuplicateNumber(int[] array) {
            int slow = array[0];
            int fast = array[0];
            do {
                slow = array[slow];
                fast = array[array[fast]];
            } while (slow != fast);

            slow = array[0];
            while (slow != fast) {
                slow = array[slow];
                fast = array[fast];
            }
            if (slow == 0) {
                return -1;     // No duplicate found
            }

            return slow;
        }
    }
//The code uses Floyd's Tortoise and Hare algorithm
//using sorting and finding the duplicated ele: will take O(nlogn)
//take input as 2 3 1 1 to understand why 2 loops reqd.
//first loop identifies intersection point, second loop exactly fetches the duplicate.

//using hashset will take O(n) space, hence this is the best approach
//this approach will work even if duplicate element not present

/*
Constraints: 1 <= n <= 10^5
        nums.length == n + 1
        1 <= nums[i] <= n*/
