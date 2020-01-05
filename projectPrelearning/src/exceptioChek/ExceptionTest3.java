package exceptioChek;

public class ExceptionTest3 {

    public static void main(String args[]) {
        try {
            fun();
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        } catch (RuntimeException e) {
            System.out.print("C");
        } catch (Exception e) {
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        System.out.print("F");
    }

    static void fun() {
        throw new ArithmeticException();
    }
}
