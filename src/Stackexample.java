import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 =new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        displayStack(stack);
        stack.push(5);
    System.out.println("Popped: " + stack.pop());
        displayStack(stack);
    }


    private static void displayStack(Stack<Integer> stack) {
        System.out.print("Stack: ");
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
