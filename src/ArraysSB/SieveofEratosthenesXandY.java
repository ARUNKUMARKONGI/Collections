package ArraysSB;

import java.util.Scanner;

public class SieveofEratosthenesXandY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sieveOfEratosthenes(x, y);
    }

    static void sieveOfEratosthenes(int x, int y) {
        boolean[] primes = new boolean[y + 1];
        for (int i = 0; i <= y; i++) {
            primes[i] = true;
        }
        //Arrays.fill(primes,true);

          primes[0]=primes[1]=false;
        for (int i = 2; i * i <= y; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= y; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = x; i <= y; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
