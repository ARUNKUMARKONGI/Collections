package ArraysSB;

import java.util.Scanner;
public class DuplicateUsingXoR {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] nums = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }
            int res = 0;
            for (int num : nums) {
                res ^= num;
            }
            for (int i = 1; i <= size - 1; i++) {
                res ^= i;
            }
            System.out.println("Duplicate number: " + res);
        }
    }
/*
The XOR operation cancels out the non-duplicate numbers due to the property that a ^ a = 0
When XOR-ing all numbers from 1 to n, only the duplicate number remains in xorResult*/
//Nte: this will work only if the range of values is within the entered array size.
//this xor method will assume that atleast one duplicate element is present
