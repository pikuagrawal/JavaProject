package javaOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 3, b = 5, c =8;

        // using of '&&' operator
        System.out.println("Print the value of a<b && b>c: " + (a<b && b>c));// false
        System.out.println("Print the value of a>b && b<c: " + (a>b && b<c));// false

        // using of '||' operator
        System.out.println("Print the value of a<b || b>c: " + (a<b || b>c));// true
        System.out.println("Print the value of a>b || b<c: " + (a>b || b<c));// true

        // using of '!' operator
        System.out.println("Print the value of !((a<b && b>c)): " + !((a<b && b>c)));// true
        System.out.println("Print the value of !((a>b || b<c)): " + !((a>b || b<c)));// false
    }
}
