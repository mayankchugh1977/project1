package binary.com.upgrad.hash;

import java.util.*;
public class PrintDistinctHashMap{
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        Map<String,Integer> hmap = new HashMap<String,Integer>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry localMap = (Map.Entry)it.next();
            if(!hmap.containsKey(localMap.getValue())){
                System.out.print(localMap.getValue()+" ");
                hmap.put((String)localMap.getValue(),(Integer) localMap.getKey());
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
