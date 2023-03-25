package variables;
public class Bird {
    // states of bird
    static String color = "Green";
    static int weight = 300;
    static int age = 15;
    static int height = 23;
// Behaviour of Bird
    public static void eat() {
        System.out.println("Bird can eat");}
    public static void fly(){
        System.out.println("Bird can fly");
    }
    public static void makeSound(){
        System.out.println("Bird can make a sound");
    }
    public static void main(String[] args) {
        System.out.println("Bird Color:"+" " +color);
        System.out.println("Bird Weight:"+ " "+weight);
        System.out.println("Bird Age:"+ " "+age);
        System.out.println("Bird Height:"+ " "+height);
        eat();
        fly();
        makeSound();
    }
}

