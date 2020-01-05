package prelearning;

public class WhileLoop3 {
    public static void main(String[] args) {

        int num = 1;
        int product = 1;

        while (num <= 10) {
            System.out.println("Before: num -> "+num+" & product ->"+product);
            product = product*num;
            num ++;
            System.out.println("After: num -> "+num+" & product ->"+product);
        }
        System.out.println(product);
    }
}