import java.io.*;
import java.util.*;
import java.math.*;

public class BigIntegerSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        BigInteger n1 = new BigInteger(n);
        BigInteger sum = BigInteger.ZERO;

        while (!n1.equals(BigInteger.ZERO)) {
            BigInteger digit = n1.mod(BigInteger.TEN);
            sum = sum.add(digit);
            n1 = n1.divide(BigInteger.TEN);
        }

        System.out.println(sum);
    }
}
