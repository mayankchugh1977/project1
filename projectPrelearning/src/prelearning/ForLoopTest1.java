package prelearning;

public class ForLoopTest1 {

    public static void main(String[] args) {
        int n=2;
        for (int i=12-n; i>2;i=i-n){
            System.out.println(i);
        }

        for (int j=10-n;j<0;j++){
            System.out.println(j);
        }

        for (int number = 1; number <= 100; number++) {
            System.out.print(number+ " ");
            number++;
        }


    }
}
