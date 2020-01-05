package oop.Polymorphism;

class Student6 {
  protected final String name;
  protected int year;

  private static final int annualFees = 10000;

  public Student6(String name, int year) {
    this.name = name;
    this.year = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + computeFees();
  }

  public int computeFees() {
    return Student6.annualFees * year;
  }
}

class ResearchStudent6 extends Student6 {
  protected String researchArea;
  private static final int annualFees = 10000;

  public ResearchStudent6(String name, int year, String researchArea) {
    super(name, year);
    this.researchArea = researchArea;
  }

  public String getDetails() {
      return this.name + " is a research student with research area" + researchArea + " and he/she is in his/her year: " + year;
    }
  }


class PhDStudent6 extends ResearchStudent6 {
  private String thesisTitle;
  private static final int annualFees = 10000;

  public PhDStudent6(String name, int year, String researchArea, String thesisTitle) {
    super(name, year, researchArea);
    this.thesisTitle = thesisTitle;
  }

  public String getDetails() {
      return this.name + " is a PhD student with research area" + researchArea + " and he/she is in his/her year: " + year + ". He/She working on the thesis titled " + thesisTitle;
    }
  }




public class IandP9_1 {
  public static void main(String[] a) {

    Student6 s1 = new Student6("karan", 3);
//    System.out.println(s1.getDetails());

    ResearchStudent6 s2 = new ResearchStudent6("siddharth", 4, "Software Engineering");
//    System.out.println(s2.getDetails());

    PhDStudent6 s3 = new PhDStudent6("hari", 1, "Software Engineering", "Automated Evaluation");
//    System.out.println(s3.getDetails());

    Student6[] array = {s1, s2, s3};
    printDetails(array);


  }

  public static void printDetails (Student6 [] students)
  {for (Student6 student: students){
    System.out.println(student.getDetails());
    }
  }
}

