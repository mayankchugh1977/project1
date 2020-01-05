package Search.sort;


public class PracticeTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12};
        // Jagged arrays
        int[][] arr = {arr1, arr2, arr3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}