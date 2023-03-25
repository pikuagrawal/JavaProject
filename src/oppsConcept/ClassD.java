package oppsConcept;

public class ClassD extends ClassA {
    int d = 9;
    public void myMethodD(){
        System.out.println("This is the Class D.");
    }
    public static void main(String[] args) {
        ClassD classD = new ClassD();
        System.out.println("Print the value of d is " + classD.d);
        System.out.println("Print the value of a is " + classD.a);
        System.out.println("Print the value of x is " + x);
        classD.myMethodD();
        classD.myMethodA();
        myMethodA1();
    }
}
