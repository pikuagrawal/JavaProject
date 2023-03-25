package Lecture11;
public class MethodOverriding extends ClassOverriding {
     public static void subtraction(int a, int b){
        System.out.println("Print the value of a-b: " + (a-b));
    }
    public static void subtraction(int a, int b, int c){
        System.out.println("Print the value of a-b-c: " + (a-b-c));
    }
    public static void main(String[] args) {
        subtraction(18,9);
        subtraction(34,635,76);

    }
}
