/*
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction
(positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Test case example 1:
------------------
Input= 3
-5 10 -4
Output=
State of the asteroids after collisions: [-5, 10]

Explaination: 5 and 10 are moving in opposite direction (5 towards left, 10 towards right) so they never collide.
              10 and -4 will collide (10 --->  <---- -4) the smaller one which is 4 will explode. Hence
              remaining result is [-5, 10]

test case example 2:
-----------------------
input= 3
-7 -10 -2
output=
State of the asteroids after collisions: [-7, -10, -2]


test case example 3:
-----------------------
input=4
5 10 12 -20
4
output=
State of the asteroids after collisions: [-20]


test case example 4
-------------------------
input=4
5 10 12 -12
output=
State of the asteroids after collisions: [5, 10]

Explaination: Since all asteroids are moving in same direction. nothing will collide.

Algorithm:
------------------------------------------
For each asteroid:
If the asteroid is positive (> 0) or the stack is empty or the last element in the stack is negative (< 0),
we simply add the asteroid to the stack.
This is because positive asteroids always move to the right, and we can add them without any collision concerns.

If the asteroid is negative (< 0), and there is a possibility of collision:

We check if the last element in the stack is less than or equal to the absolute value of the current asteroid.
If true, it means a collision will occur.
If a collision occurs, we compare the absolute values of the last element in the stack and the current asteroid.
If the last element's absolute value is less, it means the last element (asteroid) will explode,
and we remove it from the stack. We also decrement i to reevaluate the current index.

After all iterations, we convert the remaining elements in the stack to an array and return it as the final result.

*/
//write your code below
import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        List<Integer> result = asteroidCollision(list);
        System.out.println("State of the asteroids after collisions: " + result);
    }

    public static List<Integer> asteroidCollision(List<Integer> list) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 || stack.isEmpty() || stack.getLast() < 0)
            {
                stack.add(list.get(i));
            } else if (stack.getLast() <= -list.get(i))
            {
                if (stack.pollLast() < -list.get(i))
                {
                    i--;
                }
            }
        }

        return new ArrayList<>(stack);
    }
}
