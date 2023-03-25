package Lecture11;

public class MethodOverloading {
    public static void print(int a){
        System.out.println("Print the value of a: " + a );
    }
    public static void print(String a, String b){
        System.out.println("Print the value of a+b: " + a+" " +b);
    }
    public static void print(float a,float b, float c){
        System.out.println("Print the value of a+b+c: " + (a+b+c));
    }

    public static void main(String[] args) {
        print(2);
        print("Priyanka","Agrawal");
        print(2.3f,3.5f,4.58f);
    }
}
