package oppsConcept;

public class MyConstructor {
    public MyConstructor(){ // user defined constructor
        System.out.println("This is my Constructor");
    }
    public MyConstructor(int a, int b){ //parametrized constructor

        System.out.println("Total sum of a+b " + (a+b));
    }
    public static void main(String[] args) {
        MyConstructor myConstructor1 = new MyConstructor();
        MyConstructor myConstructor2 = new MyConstructor();
        myConstructor1 = new MyConstructor(2, 3);
        myConstructor1 = new MyConstructor(10, 30);

    }
}
