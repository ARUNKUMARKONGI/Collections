/*given the list of elements for example assume the first element as candidate element
  initially if count is zero, make the first element as winning candidate element.
  then compare candidate element with input array element from position zero,
  if both are same make count++ else count--
  continue loop, check if count is zero, everytime,
  if so make the next element as potential candidate element.
  if not check if the next element in the list is same as candidate element,
     if so increment the count else count--.
  Once we reach end of the loop,
  Come out and check in for loop, how many times candidate element is appearing in the list.
  i.e the final count of candidate element.
  If the final count is greater than list size/2 then its a winning candidate element.
  or else return -1.

 */

import java.util.ArrayList;
import java.util.Scanner;
class BoyerMooreVoting {
    static int winningCandidate(ArrayList<Integer> list) {
        int count = 0;                         //ex: 1 2 3 2 2
        int candidate = -1;
        for (int num : list) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate)
            {
                count++;
            }
            else count--;
        }
        int finalCount = 0;
        for (int num : list) {
            if (num == candidate) {
                finalCount++;
            }
        }
        if (finalCount > list.size() / 2) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the size of the ArrayList: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println("Enter elements for the ArrayList:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        int res = winningCandidate(list);
        if (res != -1) {
            System.out.println("Winning Candidate: " + res);
        } else {
            System.out.println("No Winning Candidate");
        }
        sc.close();
    }
}
