package collect.array.copy;

import java.util.*;

public class LinkedListOps2 {
  public static void main(String[] args) {
    LinkedList<Student5> studentList = new LinkedList<Student5>();
    Student5 s1 = new Student5("Sujit",1);
    Student5 s2 = new Student5("Siddharth",2);
    Student5 s3 = new Student5("Karanpreet",3);
    Student5 s4 = new Student5("Hari",5);
    Student5 s5 = new Student5("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    studentList.remove(3);
    // System.out.println("s1 contained?"+ studentList.contains(s1));
    // System.out.println("s5 contained?"+ studentList.contains(s5));

    Student5 s = studentList.get(1);
    System.out.println(s.getDetails());
    // printStudentList(studentList);

  }

  public static void printStudentList(LinkedList<Student5> students) {
    for(Student5 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student5 {
  private final String name;
  private final int rollNumber;

  public Student5(String name, int rollNumber) {
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
