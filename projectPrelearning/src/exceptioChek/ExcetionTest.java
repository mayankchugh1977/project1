package exceptioChek;

public class ExcetionTest {
    public static void main(String args[]) {
        try {
            fun(50);
        } finally {
            System.out.println("code inside finally block");
        }
    }

    static void fun(int n) {
        if (n < 60)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible for pension");
    }
}