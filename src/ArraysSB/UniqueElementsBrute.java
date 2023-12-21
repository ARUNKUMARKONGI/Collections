package ArraysSB;
import java.util.*;
public class UniqueElementsBrute {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the size of the array
            int N = scanner.nextInt();

            // Read the elements of the array
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            // Print unique elements
            findAndPrintUniqueElements(array);
        }

        private static void findAndPrintUniqueElements(int[] array) {
            int N = array.length;

            // Use a boolean array to mark visited elements
            boolean[] visited = new boolean[N];

            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    // Print the current element if it's not visited
                    System.out.print(array[i] + " ");

                    // Mark all occurrences of the current element as visited
                    for (int j = i + 1; j < N; j++) {
                        if (array[i] == array[j]) {
                            visited[j] = true;
                        }
                    }
                }
            }
        }
    }
