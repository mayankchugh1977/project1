import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class WithListIterator2 {

  public static void main(String[] args) {

    List<Student12> studentList1 = new ArrayList<Student12>();
    Student12 s1 = new Student12("Sujit",1);
    Student12 s2 = new Student12("Siddharth",2);
    Student12 s3 = new Student12("Karanpreet",3);
    Student12 s4 = new Student12("Hari",5);
    Student12 s5 = new Student12("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    iterateBkwd(studentList1);
  }

  private static void iterateFwd(List<Student12> students) {
    ListIterator<Student12> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<Student12> students) {
    ListIterator<Student12> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class Student12 {
  private final String name;
  private final int rollNumber;

  public Student12(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
