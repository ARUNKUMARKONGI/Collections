package HashSetHashMap;
import java.io.*;
import java.util.*;

public class DuplicateUsinghashmap {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                int x = sc.nextInt();
                if(map.containsKey(x)) map.put(x,map.get(x)+1);
                else map.put(x,1);
            }

            for(int i: map.keySet()){
                if(map.get(i)>1){
                    System.out.println(i);
                }
            }
        }
    }