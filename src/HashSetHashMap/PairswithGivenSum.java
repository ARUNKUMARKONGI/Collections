package HashSetHashMap;
import java.util.HashMap;
import java.util.*;
public class PairswithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int k = sc.nextInt();
        int count = countPairsWithSumK(array, k);
        System.out.println("Number of pairs with sum " + k + ": " + count);
    }

    private static int countPairsWithSumK(int[] nums, int target) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;   //1,5,7,-1 . suppose k=6. possible complement is 6-1=5, 5 key exists in hashmap.
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}

