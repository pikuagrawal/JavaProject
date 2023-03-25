package oppsConcept;

public class ClassA {
    int a = 4;
    static int x = 5;
    public void myMethodA(){
        System.out.println("This is the Class A.");
    }
    public static void myMethodA1(){
        System.out.println("This is the Second Method of Class A.");
    }
    public static void main(String[] args) {
     ClassA classA = new ClassA();
        System.out.println("Print the value of a is " + classA.a);
        classA.myMethodA();
        System.out.println("Print the value of x is " + x);
        myMethodA1();
    }
}
