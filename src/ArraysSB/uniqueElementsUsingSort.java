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

            for (int i = 0; i < len; i++) {
                if (i == 0 || array[i] != array[i - 1]) {
                    int count = 1;
                    for (int j = i + 1; j < len && array[i] == array[j]; j++) {
                        count++;
                    }
                    if (count == 1) {
                        System.out.print(array[i] + " ");
                    }
                }
            }
        }
    }

