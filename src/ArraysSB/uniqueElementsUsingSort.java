package ArraysSB;
import java.util.Scanner;
import java.util.Arrays;
public class uniqueElementsUsingSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int len = array.length;
            if (len == 0) {
                return;
            }
            System.out.print(array[0] + " ");
            for (int i = 1; i < len; i++) {
                if (array[i] != array[i - 1]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
