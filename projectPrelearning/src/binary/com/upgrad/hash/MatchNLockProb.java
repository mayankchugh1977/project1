package binary.com.upgrad.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MatchNLockProb {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }

        //write your code here

        //Create a hashmap.
        Map<Character, Integer> mapObj = new HashMap<Character, Integer>();

        //Iterate through the array of locks and add locks[i] as key and the index ‘i’ as value to the hashmap.

        for (int i = 0; i < locks.length; i++) {

            if(!mapObj.containsKey(locks[i])){
                mapObj.put(locks[i],i);
            }
        }

        //For every key, check whether the corresponding lock is present or not. If present, then store the key[i] to locks[i]. If it is not present, print ‘Not possible’ and return.

        for (int i = 0; i < keys.length; i++) {
            if (mapObj.get(keys[i]) != null)
                locks[i] = keys[i];
            else {
                System.out.println("Not possible");
                System.exit(0);
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(keys[i] +" "+  locks[i]);
        }

    }
}

