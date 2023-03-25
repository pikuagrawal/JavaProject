package oppsConcept;
public class ClassC extends ClassB {
    int c = 8;
    public void myMethodC(){
        System.out.println("This is the Class C.");
    }
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        System.out.println("Print the value of c is " + classC.c);
        System.out.println("Print the value of b is " + classC.b);
        System.out.println("Print the value of a is " + classC.a);
        System.out.println("Print the value of x is " + x);
        classC.myMethodC();
        classC.myMethodB();
        classC.myMethodA();
        classC.subtraction(23,12);
        myMethodA1();
        addition(45,34);
    }
}
