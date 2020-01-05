package oop.Polymorphism;

abstract class Person1 {
  protected final String name;

  public Person1(String name) {
    this.name = name;

  }

  public abstract String getDetails();

}

class Student1 extends Person1{

  protected int year;

  protected static final int annualFees = 10000;

  public Student1(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student1.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor1 extends Person1 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor1(String name, int employeeNumber) {
    super(name);
    this.employeeNumber = employeeNumber;
  }
  public String getDetails(){
      return "Name : " + name + '\n' +
              "Salary : " + this.computeSalary();
    }

  public float computeSalary(){
    return this.startingSalary;

  }

}


class ResearchStudent extends Student1 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student1.annualFees * this.year*0.9f;
  }


  }


public class IandP11 {
  public static void main(String[] a) {

    Student1 s1 = new Student1("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor1 p1 = new Professor1("SKC", 100);

    Person1[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person1 [] persons) {
    for (Person1 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

