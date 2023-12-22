package HashSetHashMap;
import java.util.*;
public class DuplicateNumberUsingHashset {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n;
            System.out.print("Enter the size of the array: ");
            n = scanner.nextInt();

            long[] a = new long[n];
            Set<Long> set = new HashSet<>();

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            System.out.print("Duplicate Element(s): ");
            Set<Long> dup = new HashSet<>();
            for (long num : a) {
                if (!set.add(num)) {
                    dup.add(num);
                }
            }
            for (long i : dup) {
                System.out.print(i + " ");
            }
        }
    }
