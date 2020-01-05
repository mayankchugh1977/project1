package algo.module.one;

class DemoOne {
    int i = 1;

    int function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            function();
        }
        return 0;
    }

    public static void main(String[] args) {
        DemoOne obj = new DemoOne();
        obj.function();
    }
}