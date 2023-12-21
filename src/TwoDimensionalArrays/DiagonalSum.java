package TwoDimensionalArrays;
import java.util.*;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

       // System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
            int sum = 0;
            int len = matrix.length;


            for (int i = 0; i < len; i++) {
                sum += matrix[i][i];
                sum += matrix[i][len - 1 - i];
            }

            if (len % 2 == 1) {
                int mid = len / 2;
                sum -= matrix[mid][mid];
            }

            System.out.println("Diagonal Sum is: "+sum);
        }

    }


/*import java.util.*;
class DiagonalSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==n-1){
                    sum=sum+arr[i][j];
                }

            }
        }
        System.out.println("Sum of Diagonals: "+sum);

    }

}*/
