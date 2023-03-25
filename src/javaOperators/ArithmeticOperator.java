package javaOperators;
public class ArithmeticOperator {
    public static void main(String[] args) {
        // assigning the variables
        int x = 15000, y = 50000;
        int z1, z2;
        // addition operator
        System.out.println("Addition x+y: "+ (x+y));
        // subtraction operator
        System.out.println("Subtraction x-y: "+ (x-y));
        // multiplication operator
        System.out.println("Multiplication x*y: "+ (x*y));
        // division operator
        System.out.println("Division x/y: "+ (x/y));
        // modulus operator
        System.out.println("Modulus x%y: "+ (x%y));
        // increment operator
        z1= x++;
        System.out.println("Postfix Increment x++: "+ z1); // x= 15001 after post increment
        // decrement operator
        z2= x--;
        System.out.println("Postfix Decrement x--: "+ z2); // x= 15000 after post decrement
        System.out.println("Prefix Increment ++y: "+ ++y); // y= 50001 after pre increment
        System.out.println("Postfix increment y++: "+ y++);// y = 50002 after post increment
        System.out.println("Print value of y: " + y);
        System.out.println("Prefix Increment --y: "+ --y); // y= 50001 after pre decrement
    }
}
