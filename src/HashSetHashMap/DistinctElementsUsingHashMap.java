package HashSetHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DistinctElementsUsingHashMap {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Distinct elements in the array:");
            printDistinctElements(array);
        }

        private static void printDistinctElements(int[] array) {
            Map<Integer, Integer> res = new HashMap<>();

            for (int num : array) {
                res.put(num, res.get(num) + 1);
               // frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer>  m: res.entrySet()) {
                if (m.getValue() == 1) {
                    System.out.print(m.getKey() + " ");
                }
            }
        }
    }

