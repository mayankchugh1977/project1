package collect.array;

import java.util.*;

public class ArrayListOps3 {
  public static void main(String[] args) {
    ArrayList<Student9> studentList = new ArrayList<Student9>();
    Student9 s1 = new Student9("Sujit",1);
    Student9 s2 = new Student9("Siddharth",2);
    Student9 s3 = new Student9("Karanpreet",3);
    Student9 s4 = new Student9("Hari",5);
    Student9 s5 = new Student9("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(ArrayList<Student9> students) {
    for(Student9 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student9 {
  private final String name;
  private final int rollNumber;

  public Student9(String name, int rollNumber) {
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
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/
