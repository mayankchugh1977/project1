package Search.sort;

import java.util.Scanner;

class InsertionArraySortDesc {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        //Write your code here

        String temp;
        for (int i = 1; i < firstNames.length; i++) // ar[i] is element to insert
        {
            temp = firstNames[i];
            int j = 0;
            for (j = i; j > 0; j--)
                if (temp.compareTo(firstNames[j - 1]) < 0)
                    firstNames[j] = firstNames[j - 1];
                else
                    break;
            firstNames[j] = temp;
        }

        for (String element : firstNames)
            System.out.println(element);


        for (int i = 1; i < lastNames.length; i++) // ar[i] is element to insert
        {
            temp = lastNames[i];
            int j = 0;
            for (j = i; j > 0; j--)
                if (temp.compareTo(lastNames[j - 1]) >= 0)
                    lastNames[j] = lastNames[j - 1];
                else
                    break;
            lastNames[j] = temp;
        }


        for (String element : lastNames)
            System.out.println(element);
    }
}
