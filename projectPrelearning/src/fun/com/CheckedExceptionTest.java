package fun.com;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

class CheckedExceptionTest {
    public static void main(String[] args) {
        // Enter a string in the input console
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData = null;
        try {
            inData = stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("You wrote: " + inData);

    }
}

