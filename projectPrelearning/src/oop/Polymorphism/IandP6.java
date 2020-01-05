package oop.Polymorphism;

class Student22 {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Student22(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public float computeFees () {
    return Student22.annualFees * year;
  }
  public float computeFees (int annualFees){return annualFees*this.year;}
}

class ResearchStudent22 extends Student22 {
  private String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent22(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;

  }

  @Override
  public String getDetails() {
    return super.getDetails() + '\n' + "Research Area : " + this.researchArea;
  }
}





public class IandP6 {
  public static void main(String[] a) {


    Student22 s1 = new Student22("karan", 2);
    System.out.println(s1.getDetails());
    System.out.println(s1.computeFees());
    ResearchStudent22 s2 = new ResearchStudent22("siddharth", 3, "Software Engineering");
    System.out.println(s2.getDetails());
    System.out.println(s2.computeFees(1000));
  }
}

