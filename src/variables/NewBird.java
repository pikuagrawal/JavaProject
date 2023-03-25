package variables;
public class NewBird {
    // States of bird
    String color= "Green";
    int age = 24;
    int height = 33;
    int weight = 45;
// behaviour of bird
    public void run(){
        System.out.println("bird can run"); }
    public void eat(){
            System.out.println("bird can eat");}
    public void fly(){
        System.out.println("bird can fly");
    }
    public static void main(String[] args) {
        NewBird bird= new NewBird(); //object creation for calling instance variable and non static method
        System.out.println("Bird Age:"+" " +bird.age);
        System.out.println("Bird Color:"+" " +bird.color);
        System.out.println("Bird Height:"+" " +bird.height);
        System.out.println("Bird Weight:"+" " +bird.weight);
        bird.run();
        bird.eat();
        bird.fly();
    }
}
