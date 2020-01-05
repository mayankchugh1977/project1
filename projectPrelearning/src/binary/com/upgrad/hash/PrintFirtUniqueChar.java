package binary.com.upgrad.hash;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

    public class PrintFirtUniqueChar {

        public static void main(String arg[]) {

            Scanner in = new Scanner(System.in);

            //storing the input string to String variable "str"
            String str = in.nextLine();
            //write your code here

            Map<String, LinkedHashSet<Character>> m = new HashMap<String,LinkedHashSet<Character>>() ;
            m.put("one", new LinkedHashSet<Character>());
            m.put("else", new LinkedHashSet<Character>());
            m.put("all", new LinkedHashSet<Character>());
            for (int i = 0; i < str.length(); i++) {
                if (m.get("all").contains(str.charAt(i))) {
                    m.get("one").remove(str.charAt(i));
                    m.get("else").add(str.charAt(i));
                } else {
                    m.get("one").add(str.charAt(i));
                    m.get("all").add(str.charAt(i));
                }
            }
            if(m.get("one").size()>0){
                System.out.println(m.get("one").iterator().next());
            }else{
                System.out.println("-1");
            }

        }
    }
