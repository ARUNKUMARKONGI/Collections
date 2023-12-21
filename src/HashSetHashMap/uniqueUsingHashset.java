package HashSetHashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueUsingHashset {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            findAndPrintUniqueElements(array);
        }
        private static void findAndPrintUniqueElements(int[] array) {
            Set<Integer> uni = new HashSet<>();

            for (int i : array) {
                if (uni.add(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

