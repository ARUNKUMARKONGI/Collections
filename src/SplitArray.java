import java.util.ArrayList;
import java.util.Scanner;

class SplitArray {
    public static void split(ArrayList<Integer> arr) {
        boolean b = false;
        int l = arr.size();
        int sum = 0, tempsum = 0;

        for (int i = 0; i < l; i++) {
            sum += arr.get(i);
        }
        for (int i = 0; i < l; i++) {
            tempsum += arr.get(i);
            if (2 * tempsum == sum) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        split(list);
    }
}
