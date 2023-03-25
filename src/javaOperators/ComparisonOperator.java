package javaOperators;

public class ComparisonOperator {
    // assigning the variables
    public static void main(String[] args) {
        int a = 8, b = 8, c = 5;

        // using of '==' operator
        System.out.println("Print the value of a == b: " + (a==b)); // true

        // using of '!=' operator
        System.out.println("Print the value of a != b: " + (a!=b));// false
        System.out.println("Print the value of a != c: " + (a!=c));// true

        // using of '>' operator
        System.out.println("Print the value of a > b: " + (a>b));// false
        System.out.println("Print the value of a > c: " + (a>c));// true

        // using of '<' operator
        System.out.println("Print the value of a < b: " + (a<b));// false
        System.out.println("Print the value of a < c: " + (a<c));// false

        // using of '>=' operator
        System.out.println("Print the value of a >= b: " + (a>=b));// true
        System.out.println("Print the value of a >= c: " + (a>=c));// true

        // using of '<=' operator
        System.out.println("Print the value of a <= b: " + (a<=b));// true
        System.out.println("Print the value of a <= c: " + (a<=b));// true
    }

}
