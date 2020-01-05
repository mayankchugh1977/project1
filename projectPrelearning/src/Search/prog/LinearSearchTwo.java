package Search.prog;
import java.util.Scanner;

public class LinearSearchTwo {
    public static void main(String args[]) {
        int count;
        int i;

        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        int array[] = new int[count];

        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }

        int key = input.nextInt();
        input.close();
        int result=0;
        for (i = 0; i < count; i++) {
            if (array[i] == key) {
                result = (count-1)-i;
            }
        }
        if (result>=0) System.out.println(result);

    }
}