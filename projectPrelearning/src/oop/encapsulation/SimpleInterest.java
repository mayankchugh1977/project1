package oop.encapsulation;

// Java prelearning.Program to Calculate Simple Interest


class SimpleInterestCalculator {

    double pAmount;
    double roi;
    double timeInYears;

    public SimpleInterestCalculator (double pAmount, double roi, double timeInYears){
        this.pAmount =  pAmount;
        this.roi =  roi;
        this.timeInYears =  timeInYears;

    }

    public void calSimpleInterest()
    {
        double simpleInterset;

        simpleInterset = (this.pAmount * this.roi * this.timeInYears) / 100;

        System.out.println("\n The Simple Interest for Principal Amount " + this.pAmount + " is = " + simpleInterset);
    }
}

public class SimpleInterest {

    public static void main(String[] args)
    {

        SimpleInterestCalculator obj = new SimpleInterestCalculator(80000,4, 2);
        obj.calSimpleInterest();

    }

}

