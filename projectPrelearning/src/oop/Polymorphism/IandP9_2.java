package oop.Polymorphism;

class Student4 {
  protected final String name;
  protected int year;

  protected static final int annualFees = 10000;

  public Student4(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  protected float computeFees() {
    return Student4.annualFees * year;
  }

  public float computeFees(int annualFees){
    return annualFees * this.year;
  }

}

class ResearchStudent4 extends Student4 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent4(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  protected float computeFees(){
      return Student4.annualFees * this.year*0.9f;
  }


  }


public class IandP9_2 {
  public static void main(String[] a) {

    Student4 s1 = new Student4("karan", 3);
    System.out.println(s1.getDetails());

    ResearchStudent4 s2 = new ResearchStudent4("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());


  }


}

