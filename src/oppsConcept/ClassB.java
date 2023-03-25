package oppsConcept;

public class ClassB extends ClassA{
    int b = 3;
    public void myMethodB(){
        System.out.println("This is the Class B.");
    }
    public static void addition(int a, int b){
        System.out.println("Addition of a+b: " + (a+b));
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction of a-b: "+ (a-b));
    }
    public static void main(String[] args) {
        ClassB  classB = new ClassB();
        System.out.println("Print the value of b is "+ classB.b);
        classB.myMethodB();
        System.out.println("Print the value of a is "+ classB.a);
        classB.myMethodA();
        System.out.println("Print the value of x is " + x);
        myMethodA1();
        addition(10,20);
        classB.subtraction(40,50);
    }
}
