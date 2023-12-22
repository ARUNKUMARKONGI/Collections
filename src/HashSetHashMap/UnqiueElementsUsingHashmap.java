package HashSetHashMap;
import java.util.*;
public class UnqiueElementsUsingHashmap {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else map.put(x,1);
        }
        for(int x : map.keySet()){
            if(map.get(x) == 1) System.out.print(x+" ");
        }
    }
}

