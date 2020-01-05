package oop.Polymorphism;

interface Person2 {
   public abstract String getDetails();
   public abstract float computeSalary();
}

class Student2 implements Person2{
  protected final int rollNumber;
  protected int year;

  protected static final int annualFees = 10000;
  protected static final int annualSalary = 15000;

  public Student2(int rollNumber, int year) {
    this.rollNumber = rollNumber;
    this.year = year;
  }


  public String getDetails() {
    return "Roll Number : " + rollNumber + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student2.annualFees * year;
  }

  public float computeFees(int annualFees){
    return Student2.annualFees * this.year;
  }

  public float computeSalary() {
    return Student2.annualSalary * this.year;
  }
}

class Professor2 implements Person2 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor2(int employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Employee Number : " + this.employeeNumber;
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudent2 extends Student2 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent2(int rollNumber, int year, String researchArea) {
    super(rollNumber, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student2.annualFees * this.year*0.9f;
  }


  }


public class IandP12 {
  public static void main(String[] a) {

    Student2 s1 = new Student2(200, 2);
    //System.out.println(s1.getDetails());

    ResearchStudent2 s2 = new ResearchStudent2(300, 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor2 p1 = new Professor2(100);

    Person2[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person2 [] persons) {
    for (Person2 person: persons) {
      System.out.println(person.getDetails());
      System.out.println("Salary: " + person.computeSalary());
    }
  }


}

