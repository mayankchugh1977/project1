package collect.array.copy;

import java.util.*;

public class ListPolymorphism1 {
  public static void main(String[] args) {
    List<Student6> studentList1 = new ArrayList<Student6>();
    List<Student6> studentList2 = new LinkedList<Student6>();

    Student6 s1 = new Student6("Sujit",1);
    Student6 s2 = new Student6("Siddharth",2);
    Student6 s3 = new Student6("Karanpreet",3);
    Student6 s4 = new Student6("Hari",5);
    Student6 s5 = new Student6("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);

    studentList2.add(s4);
    studentList2.add(s5);

    printStudentList(studentList1);
    printStudentList(studentList2);


  }

  public static void printStudentList(List<Student6> students) {
    System.out.println("Printing student details.....");
    for(Student6 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student6 {
  private final String name;
  private final int rollNumber;

  public Student6(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======

  printStudents as a polymorphic function. It uses List (which is a super-class of ArrayList and List) 
    instead of ArrayList or List, thus inter-operates smoothly with both types.
*/
