package HashSetHashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class UniqueUsingHashSet {
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
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : array) {
            if (!seenNumbers.contains(num)) {
                seenNumbers.add(num);
                uniqueSet.add(num);
            } else {
                uniqueSet.remove(num);
            }
        }

        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }
}
