package ArraysSB;
import java.util.*;
public class DuplicateNumberBruteForce {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n;
            System.out.print("Enter the size of the array: ");
            n = scanner.nextInt();

            long[] a = new long[300];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            System.out.print("Duplicate Element(s): ");
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        System.out.print(a[i] + " ");
                        break;
                    }
                }
            }
        }
    }
