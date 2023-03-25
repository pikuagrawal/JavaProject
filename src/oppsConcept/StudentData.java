package oppsConcept;

public class StudentData {
    String studentName;
    int studentRollNo;
    int studentMarks;
    public StudentData(String name, int rollNo, int marks) {
        studentName = name;
        studentRollNo = rollNo;
        studentMarks = marks;
        System.out.println("Print Student Name: " + studentName + " RollNo: " + studentRollNo + " Marks: " +studentMarks);

    }
    public static void main(String[] args) {
        StudentData studentData = new StudentData("priyanka",7, 450);
        StudentData studentData1 = new StudentData("Piku", 8, 400);

    }
}
