package fun.com;

class PracticeTest4BizzFizz {
    public static void main(String args[]) {
        int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        fizzBuzz(numbers);
    }

    public static void fizzBuzz(int[] numbers) {


        int maxNumber = 0;
        int maxIndex = 0;
        for(int i=0; i <= numbers.length -1; i++) {
            // System.out.println(votes[i]);
            if(numbers[i] % 3 == 0 && numbers[i] % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(numbers[i] % 3 == 0){
                System.out.println("Fizz");
            }else if(numbers[i] % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(numbers[i]);
            }
        }
    }
}