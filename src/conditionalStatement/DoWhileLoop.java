package conditionalStatement;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Print 1 to 20 all even numbers");
        int number = 1;
        do{
            if(number % 2 == 0) {
                System.out.print(number + " ");
            }
            number++;
        }while(number<=20);

    }
}
