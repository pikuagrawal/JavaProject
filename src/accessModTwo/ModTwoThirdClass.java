package accessModTwo;

public class ModTwoThirdClass {

    static String name = "This is my third Class";
    int d = 9;
    public static int p = 11;


    public void myMethod (){
        int e = 10;
        System.out.println(e);
    }
    static void myFirstMethod(){
        System.out.println("This is my static method");
    }

    public static void main(String[] args) {
        ModTwoThirdClass myThirdObj = new ModTwoThirdClass();
        System.out.println(name);
        myFirstMethod();
        System.out.println(myThirdObj.d);
        myThirdObj.myMethod();
    }
}
