package prelearning;

import java.util.*;
public class cast3 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        float f=input.nextFloat();
        double d=input.nextDouble();

        System.out.println("a:"+a);
        float x = (float) a;
        System.out.println("x:"+x);

        System.out.println("f:"+f);
        int y = (int) f;
        System.out.println("y:"+y);

        System.out.println("d:"+d);
        float z = (float) d;
        System.out.println("z:"+z);

    }
}
