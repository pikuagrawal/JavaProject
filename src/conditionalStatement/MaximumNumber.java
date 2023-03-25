package conditionalStatement;

public class MaximumNumber {

    public static void findMaxNum(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            System.out.println("invalid number");
        } else {
            if (a > b && a > c) {
                System.out.println(a + " is a maximum number");
            } else if (b > a && b > c) {
                System.out.println(b + " is a maximum number");
            } else {
                System.out.println(c + " is a maximum number");
            }
        }
        }
    public static void main(String[] args) {
        //int a= 3, b= 4, c= 6;
        findMaxNum(4,4,10);
        findMaxNum(4,4,4);
        findMaxNum(34,23,21);
        findMaxNum(11, 33, 33);
    }
}
