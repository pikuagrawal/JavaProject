package Lecture11;
public class StudentData implements StudentOfSectionA, StudentOfSectionB{
    @Override
    public void totalStudent() {
        System.out.println("Print the total student of section A");
    }
    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.totalStudent();
    }
}
