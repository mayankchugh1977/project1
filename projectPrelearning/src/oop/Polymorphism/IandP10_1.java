package oop.Polymorphism;

class Person5 {
  protected final String name;

  public Person5(String name) {
    this.name = name;

  }

  public String getDetails(){
    return "I have no details to share";
  }

}

class Student5 extends Person5{

  protected int year;

  protected static final int annualFees = 10000;

  public Student5(String name, int year) {
    super(name);
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student5.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }



}

class Professor5 extends Person5 {
  private int employeeNumber;
  private static final float startingSalary = 50000;

  public Professor5(String name, int employeeNumber){
    super(name);
    this.employeeNumber = employeeNumber;

  }

}


class ResearchStudent5 extends Student5 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent5(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student5.annualFees * this.year*0.9f;
  }


  }


public class IandP10_1 {
  public static void main(String[] a) {

    Student5 s1 = new Student5("karan", 2);
    //System.out.println(s1.getDetails());

    ResearchStudent5 s2 = new ResearchStudent5("siddharth", 3, "Software Engineering");
    //System.out.println(s2.getDetails());

    Professor5 p1 = new Professor5("SKC", 100);

    Person5[] array = {s1, s2, p1};
    printDetails(array);


  }

  public static void  printDetails (Person5 [] persons) {
    for (Person5 person: persons) {
      System.out.println(person.getDetails());
    }
  }


}

