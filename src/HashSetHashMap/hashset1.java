package HashSetHashMap;/*
Iterate over each pair of strings in the input array.
        Concatenate the two values of the pair into a string merged.
        if merged is not present in the set:
            - Add merged to the set.
            - Increment the count.
            - Print the current value of count.
        If present print the count.
  */
import java.util.*;
public class hashset1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] input = new String[n][2];
        // System.out.println("Enter the pairs (space-separated values):");
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            input[i] = line.split(" ");
        }
        uniquePairs(input);
        sc.close();
    }
    public static void uniquePairs(String[][] pairs) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (String[] i : pairs) {
            String merged = i[0] + " " + i[1];

            if (set.contains(merged)) {
                System.out.println(count);
            } else {
                set.add(merged);
                count++;
                System.out.println(count);
            }
        }
    }
}
