package binary.com.upgrad.hash;

import java.util.*;

public class AnagramCheck{
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        //Write your code here
        // Get lenghts of both strings
        int n1 = ch1.length;
        int n2 = ch1.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
        arrange(ch1);
        arrange(ch2);
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;

    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        //Write your code here
        // Sort strings
        Arrays.sort(ch);
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
            //System.out.println(key+value);
        }
        //Write your code here
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(check((String)pair.getKey() , (String)pair.getValue())) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
                it.remove(); // avoids a ConcurrentModificationException
            }
        }
    }
}

