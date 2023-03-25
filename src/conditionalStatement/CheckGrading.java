package conditionalStatement;

public class CheckGrading {

    public static void checkGrade(int marks, int totalMarks) {
        int percentage = ((marks*100)/totalMarks);
        System.out.println("Percentage: " + percentage);
        if(percentage>=90){

            System.out.println("Passing Grade = A+");}
        else if (percentage<90 && percentage>=70) {
            System.out.println("Passing Grade = A");
        } else if (percentage<70 && percentage>=60) {
            System.out.println("Passing Grade = B");
        } else if (percentage<60 && percentage>=50) {
            System.out.println("Passing Grade = C");
        } else if (percentage<50 && percentage>=40) {
            System.out.println("Passing Grade = D");
        }
        else{
            System.out.println("Student is failed");
        }
    }
    public static void main(String[] args) {
checkGrade(200,500);
checkGrade(700,500);
    }

}
