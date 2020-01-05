package oop.Polymorphism;

class Person3 {
  protected final String name;

  public Person3(String name) {
    this.name = name;

  }

  public String getDetails(){
    return "I have no details to share";
  }

}

class Student3 extends Person3{

  protected int year;

  protected static final int annualFees = 10000;

  public Student3(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return Student3.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor3 extends Person3 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor3(String name, int employeeNumber) {
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


class ResearchStudent3 extends Student3 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent3(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student3.annualFees * this.year*0.9f;
  }


  }


public class IandP10_2 {
  public static void main(String[] a) {

    Student3 s1 = new Student3("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent3 s2 = new ResearchStudent3("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor3 p1 = new Professor3("SKC", 100);

    Person3[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person3 [] persons) {
    for (Person3 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

