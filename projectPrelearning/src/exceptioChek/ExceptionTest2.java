package exceptioChek;

public class ExceptionTest2 {

    public static void main(String[] args) {

        try {
            System.out.print(50 / 0);
        }catch (ArithmeticException e){
            System.out.println("code inside catch block");
        }
        finally {
            System.out.println("code inside finally block");
        }
    }
}
