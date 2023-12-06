import java.util.*;

public class LongestPrimeSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
            max = Math.max(max, ar[i]);
        }
        boolean[] primes = new boolean[max + 1];
        sieve(primes);
        int currSum = 0, maxSum = 0, curLength = 0, maxLength = 0;
        if (primes[ar[0]]) {
            currSum = maxSum = ar[0];
            curLength = maxLength = 1;
        }
        for (int i = 1; i < n; i++) {
            if (primes[ar[i]] && primes[ar[i - 1]] && (ar[i] > ar[i - 1])) {
                currSum += ar[i];
                curLength++;
            } else if (primes[ar[i]]) {
                currSum = ar[i];
                curLength = 1;
            } else {
                currSum = 0;
                curLength = 0;
            }
        }
        if (curLength > maxLength) {
            maxLength = curLength;
            maxSum = currSum;
        }
        System.out.println("Maximum sum of consecutive prime numbers is "+maxSum);
   }
    static void sieve(boolean[] primes) {
        int n = primes.length;
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
}
