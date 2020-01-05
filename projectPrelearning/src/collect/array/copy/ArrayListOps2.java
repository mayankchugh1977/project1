package collect.array.copy;

import java.util.*;

public class ArrayListOps2 {
  public static void main(String[] args) {
    ArrayList<Student2> studentList = new ArrayList<Student2>();
    studentList.add(new Student2("Sujit", 1));
    studentList.add(new Student2("Siddharth", 2));
    studentList.add(new Student2("Karanpreet", 3));
    studentList.add(new Student2("Hari", 5));
    studentList.add(new Student2("Tricha", 4));


    printStudentList(studentList);

    studentList.remove(3);
    printStudentList(studentList);
    
  }

  public static void printStudentList(ArrayList<Student2> students) {
    for(Student2 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student2 {
  private final String name;
  private final int rollNumber;

  public Student2(String name, int rollNumber) {
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
