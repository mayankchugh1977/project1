package collect.array;

public class WithArray {

  public static void main(String[] args) {
    String studentList[] = {"Sujit", "Siddharth", "Karanpreet"};
    printStudentList(studentList);
    int random[ ] = new int[5];
   // int random[] = {2, 4, 5, 10, 42, 76};
  }

  public static void printStudentList(String[] students) {
    for(String s : students) {
      System.out.println(s);
    }
    
  }
}

/*
  SUMMARY
  =======
  1. prelearning.Collection of students can be represented as an array
  Int random[] = {2  4  5  10  42  76};
*/
