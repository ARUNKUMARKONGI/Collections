package ArraysSB;

import java.util.*;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the number of stalls and their positions
        // System.out.print("Enter the number of stalls: ");
        int n = scanner.nextInt();
        int[] stalls = new int[n];
        // System.out.println("Enter the positions of stalls:");
        for (int i = 0; i < n; i++) {
            stalls[i] = scanner.nextInt();
        }

        // User input for the number of cows
        // System.out.print("Enter the number of cows: ");
        int k = scanner.nextInt();

        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }

    public static int aggressiveCows(int[] stalls, int k)
    {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k))
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canWePlace(int[] stalls, int dist, int cows)
    {
        int n = stalls.length;
        int cntCows = 1;
        int last = stalls[0];
        for (int i = 1; i < n; i++)
        {
            if (stalls[i] - last >= dist)
            {
                cntCows++;
                last = stalls[i];
            }
            if (cntCows >= cows)
                return true;
        }
        return false;
    }
}