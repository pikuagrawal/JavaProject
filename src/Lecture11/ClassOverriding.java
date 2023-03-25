package Lecture11;

public class ClassOverriding {
    public static void subtraction(int a, int b){
        int c = a-b;
        System.out.println("Print the value of c: " + c);
    }
    public static void subtraction(int a, int b, int c){
        int d = a-b-c;
        System.out.println("Print the value of c: " + (a-b-c));
    }

    public static void main(String[] args) {
        subtraction(8,9);
        subtraction(34,65,76);
    }
}
