package javaOperators;
public class AssignmentOperator {
    public static void main(String[] args) {
        // assigning the variables
        int a = 5, b = 3;

        // using of '=' operator
        System.out.println("Print the value of a: " + a);

        // using of '+=' operator
        a += b; // a= a+b, a= 5+3, a=8
        System.out.println("Print the value of a += b: " + a);

        // using of '-=' operator
        a -= b; // a= a-b, a= 8-3, a= 5
        System.out.println("Print the value of a -= b: " + a);

        // using of '*=' operator
        a *= b; // a= a*b, a= 5*3, a= 15
        System.out.println("Print the value of a *= b: " + a);

        // using of '/=' operator
        a /= b; // a= a/b, a= 15/3, a= 5
        System.out.println("Print the value of a /= b: " + a);

        // using of '*=' operator
        a %= b; // a= a%b, a= 5%3, a= 2
        System.out.println("Print the value of a %= b: " + a);
    }
}
