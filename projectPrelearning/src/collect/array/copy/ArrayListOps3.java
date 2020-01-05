package collect.array.copy;

import java.util.*;

public class ArrayListOps3 {
  public static void main(String[] args) {
    ArrayList<Student3> studentList = new ArrayList<Student3>();
    Student3 s1 = new Student3("Sujit",1);
    Student3 s2 = new Student3("Siddharth",2);
    Student3 s3 = new Student3("Karanpreet",3);
    Student3 s4 = new Student3("Hari",5);
    Student3 s5 = new Student3("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(ArrayList<Student3> students) {
    for(Student3 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student3 {
  private final String name;
  private final int rollNumber;

  public Student3(String name, int rollNumber) {
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
