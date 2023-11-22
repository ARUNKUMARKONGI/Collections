import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class StackSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of stack A
        System.out.println("Enter the size of stack A:");
        int sizeA = scanner.nextInt();

        // Read elements for stack A
        Stack<Integer> stackA = new Stack<>();
        System.out.println("Enter elements for stack A:");
        for (int i = 0; i < sizeA; i++) {
            stackA.push(scanner.nextInt());
        }

        // Read size of stack B
        System.out.println("Enter the size of stack B:");
        int sizeB = scanner.nextInt();

        // Read elements for stack B
        Stack<Integer> stackB = new Stack<>();
        System.out.println("Enter elements for stack B:");
        for (int i = 0; i < sizeB; i++) {
            stackB.push(scanner.nextInt());
        }

        boolean isASubsetOfB = isSubset(new Stack<>(stackA), new Stack<>(stackB));
        boolean isBSubsetOfA = isSubset(new Stack<>(stackB), new Stack<>(stackA));

        System.out.println("Is stack A subset of Stack B?: " + isASubsetOfB);
        System.out.println("Is stack B subset of Stack A?: " + isBSubsetOfA);
    }

    public static boolean isSubset(Stack<Integer> A, Stack<Integer> B) {
        HashSet<Integer> setB = new HashSet<>(B);

        while (!A.isEmpty()) {
            int a = A.pop();

            if (!setB.contains(a)) {
                return false;
            }
        }

        return true;
    }
}
