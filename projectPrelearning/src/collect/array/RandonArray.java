package collect.array;

class RandonArray {

    public static void main(String[] args) {
        int random[] = {2, 4, 5, 10};
        printArray(random);
    }

    public static void printArray(int[] arr) {

        // Declare printArray method here
        for (int random : arr) {
            System.out.println(random);
        }
    }
}