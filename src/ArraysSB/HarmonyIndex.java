package ArraysSB;

import java.util.ArrayList;
import java.util.Scanner;
/*
first find sum
 */

class HarmonyIndex {
   public static int harmonyindex(ArrayList<Integer> arr, int n) {
        int totalSum = 0;                   //for example take input 3 2 5 3 2
        int leftSum = 0;
        /*for (int i = 0; i < n; i++)
            totalSum += arr.get(i);*/
       for(int num:arr)
           totalSum += num;

        for (int i = 0; i < n; i++) {
            totalSum = totalSum - arr.get(i);
            if (leftSum == totalSum)
                return i;
            leftSum += arr.get(i);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        int result = harmonyindex(arr, n);
        System.out.println("Harmony Index: " + result);

        scanner.close();
    }
}
