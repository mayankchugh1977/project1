package oop.Industry.relevant.content;

import java.util.*;

class Number {
    double real;
    double imag;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setNumber2(double imag) {
        this.imag = imag;
    }

    //Write your code here
    public Number(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getImaginaryPart() {
        return this.imag;
    }

}

class Complex extends Number {

    public Complex(double real, double imag) {
       super(real, imag);
    }

    public void checkComplex() {
        if(this.imag <= 0){
            System.out.println("The given number is real");
        }else {
            System.out.println("The given number is complex");
        }
    }
//Write your code here
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double real, double imag) {
        super(real, imag);
    }

    public void checkPurelyImaginaryNumber() {

        if(this.real == 0 && getImaginaryPart() == 0){
            System.out.println(this.real+"+i"+getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }else if(this.real > 0 && getImaginaryPart() > 0){
            System.out.println(this.real+"+i"+getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }else{
            if(this.real == 0 && getImaginaryPart() > 0){
                System.out.println("i"+getImaginaryPart());
                System.out.println("The number is purely imaginary");
            }else if(this.real > 0 && getImaginaryPart() == 0){
                System.out.println(this.real+"+i"+getImaginaryPart());
                System.out.println("The number is not purely imaginary");
            }
        }
    }
//Write your code here
}

public class PracticeTest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}