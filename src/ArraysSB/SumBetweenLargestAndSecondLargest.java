package ArraysSB;

import java.util.ArrayList;
import java.util.Scanner;

public class SumBetweenLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        //  System.out.println("Enter the elements of the list (enter a non-integer to stop):");
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        if (numbers.size() < 2) {
            System.out.println("At least two distinct numbers are required.");
            return;
        }
        int Big = 0;
        int secondBig = -1;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(Big)) {
                secondBig = Big;
                Big = i;
            } else if (secondBig == -1 || numbers.get(i) > numbers.get(secondBig)) {
                secondBig = i;
            }
        }
        int sum = 0;

        int k=Big<secondBig?Big:secondBig;

        for(int i=k+1;i<Big+secondBig-k;i++)
            sum=sum+numbers.get(i);

        System.out.println("Sum between the largest and second-largest numbers: " + sum);
    }
}