package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class StackSubset {
    public static boolean isSubset(Stack<Integer> A, Stack<Integer> B) {
        Stack<Integer> tempA = new Stack<>();
        Stack<Integer> tempB = new Stack<>();
        boolean isSubset = true;

        while (!A.isEmpty()) {
            int a = A.pop();
            boolean found = false;

            while (!B.isEmpty()) {
                int b = B.pop();
                tempB.push(b);
                if (a == b) {
                    found = true;
                    break;
                }
            }
            while (!tempB.isEmpty()) {
                B.push(tempB.pop());
            }
            tempA.push(a);

            if (!found) {
                isSubset = false;
                //break;
            }
        }
        while (!tempA.isEmpty()) {
            A.push(tempA.pop());
        }
        return isSubset;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = scanner.nextInt();
        Stack<Integer> A = new Stack<>();
        for (int i = 0; i < sizeA; i++) {
            A.push(scanner.nextInt());
        }

        int sizeB = scanner.nextInt();
        Stack<Integer> B = new Stack<>();
        for (int i = 0; i < sizeB; i++) {
            B.push(scanner.nextInt());
        }

        System.out.println("Is stack A subset of Stack B?: " + isSubset(A, B));
        System.out.println("Is stack B subset of Stack A?: " + isSubset(B, A));

        scanner.close();
    }
}
