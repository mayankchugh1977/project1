import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class WithListIterator3 {

  public static void main(String[] args) {

    List<Student13> studentList1 = new ArrayList<Student13>();
    Student13 s1 = new Student13("Sujit",1);
    Student13 s2 = new Student13("Siddharth",2);
    Student13 s3 = new Student13("Karanpreet",3);
    Student13 s4 = new Student13("Hari",5);
    Student13 s5 = new Student13("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);
    studentList1.add(s4);
    studentList1.add(s5);

    //iterateFwd(studentList1);
    //iterateBkwd(studentList1);
    iterateFwdBkwd(studentList1);
  }

  private static void iterateFwd(List<Student13> students) {
    ListIterator<Student13> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
  }
  private static void iterateBkwd(List<Student13> students) {
    ListIterator<Student13> it = students.listIterator(students.size());
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
  private static void iterateFwdBkwd(List<Student13> students) {
    ListIterator<Student13> it = students.listIterator();
    System.out.println("Printing student list...");
    while(it.hasNext()) {
      System.out.println(it.next().getDetails());
    }
    System.out.println("Printing student list...");
    while(it.hasPrevious()) {
      System.out.println(it.previous().getDetails());
    }
  }
}
class Student13 {
  private final String name;
  private final int rollNumber;

  public Student13(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
