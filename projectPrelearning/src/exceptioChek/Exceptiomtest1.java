package exceptioChek;

public class Exceptiomtest1 {

    public static void main(String[] args) {

    try

    {
        System.out.print(50 / 0);
        System.exit(0);
    }
finally

    {
        System.out.println("code inside finally block");
    }
}
}
