package ArraysSB;
import java.util.*;



public class FindAllDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        List<Integer> dup = new ArrayList<>();
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (!unique.add(element) && !dup.contains(element)) {
                dup.add(element);
            }
        }
        System.out.println("List of Duplicates: " + dup);
    }
}


