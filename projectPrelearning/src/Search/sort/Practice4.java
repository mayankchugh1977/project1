package Search.sort;

public class Practice4{
    public static void main(String args[]){
        int[] arr1 = new int[100];
        int[] arr2 = new int[10];
        for(int i=0;i<100;i++)
            arr1[i]=i;
        arr2 = arr1;
        for(int i=0;i<10;i++)
            System.out.print(arr2[i]+" ");
    }
}