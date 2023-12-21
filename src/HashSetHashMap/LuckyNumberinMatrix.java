package HashSetHashMap;
import java.util.*;
public class LuckyNumberinMatrix {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            int arr[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            HashSet<Integer> ele=new HashSet<Integer>();
            for(int i=0;i<m;i++){
                int min=Integer.MAX_VALUE;
                for(int j=0;j<n;j++){
                    min=Math.min(min,arr[i][j]);

                }
                ele.add(min);
            }
            int k=1,flag=0;
            for(int j=0;j<n;j++){
                int max=Integer.MIN_VALUE;
                for(int i=0;i<m;i++){
                    max=Math.max(max,arr[i][j]);

                }
                if(ele.contains(max)){
                    k=max;
                    flag=1;
                }
            }if(flag==1)
                System.out.println("Lucky Number: "+k);
        }
    }
